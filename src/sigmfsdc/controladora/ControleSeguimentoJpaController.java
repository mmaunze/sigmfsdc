
package sigmfsdc.controladora;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import sigmfsdc.controladora.exceptions.IllegalOrphanException;
import sigmfsdc.controladora.exceptions.NonexistentEntityException;
import sigmfsdc.controladora.exceptions.PreexistingEntityException;
import sigmfsdc.modelo.ControleSeguimento;

public class ControleSeguimentoJpaController implements Serializable {
    private static final Logger LOG = Logger.getLogger(ControleSeguimentoJpaController.class.getName());

    private EntityManagerFactory emf = null;
    public ControleSeguimentoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ControleSeguimento controleSeguimento) throws IllegalOrphanException, PreexistingEntityException, Exception {
        List<String> illegalOrphanMessages = null;
        var pacienteOrphanCheck = controleSeguimento.getPaciente();
        if (pacienteOrphanCheck != null) {
            var oldControleSeguimentoOfPaciente = pacienteOrphanCheck.getControleSeguimento();
            if (oldControleSeguimentoOfPaciente != null) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<>();
                }
                illegalOrphanMessages.add("The Paciente " + pacienteOrphanCheck + " already has an item of type ControleSeguimento whose paciente column cannot be null. Please make another selection for the paciente field.");
            }
        }
        if (illegalOrphanMessages != null) {
            throw new IllegalOrphanException(illegalOrphanMessages);
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            var paciente = controleSeguimento.getPaciente();
            if (paciente != null) {
                paciente = em.getReference(paciente.getClass(), paciente.getNid());
                controleSeguimento.setPaciente(paciente);
            }
            em.persist(controleSeguimento);
            if (paciente != null) {
                paciente.setControleSeguimento(controleSeguimento);
                paciente = em.merge(paciente);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findControleSeguimento(controleSeguimento.getNid()) != null) {
                throw new PreexistingEntityException("ControleSeguimento " + controleSeguimento + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ControleSeguimento controleSeguimento) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            var persistentControleSeguimento = em.find(ControleSeguimento.class, controleSeguimento.getNid());
            var pacienteOld = persistentControleSeguimento.getPaciente();
            var pacienteNew = controleSeguimento.getPaciente();
            List<String> illegalOrphanMessages = null;
            if (pacienteNew != null && !pacienteNew.equals(pacienteOld)) {
                var oldControleSeguimentoOfPaciente = pacienteNew.getControleSeguimento();
                if (oldControleSeguimentoOfPaciente != null) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<>();
                    }
                    illegalOrphanMessages.add("The Paciente " + pacienteNew + " already has an item of type ControleSeguimento whose paciente column cannot be null. Please make another selection for the paciente field.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (pacienteNew != null) {
                pacienteNew = em.getReference(pacienteNew.getClass(), pacienteNew.getNid());
                controleSeguimento.setPaciente(pacienteNew);
            }
            controleSeguimento = em.merge(controleSeguimento);
            if (pacienteOld != null && !pacienteOld.equals(pacienteNew)) {
                pacienteOld.setControleSeguimento(null);
                pacienteOld = em.merge(pacienteOld);
            }
            if (pacienteNew != null && !pacienteNew.equals(pacienteOld)) {
                pacienteNew.setControleSeguimento(controleSeguimento);
                pacienteNew = em.merge(pacienteNew);
            }
            em.getTransaction().commit();
        } catch (IllegalOrphanException ex) {
            var msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                var id = controleSeguimento.getNid();
                if (findControleSeguimento(id) == null) {
                    throw new NonexistentEntityException("The controleSeguimento with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ControleSeguimento controleSeguimento;
            try {
                controleSeguimento = em.getReference(ControleSeguimento.class, id);
                controleSeguimento.getNid();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The controleSeguimento with id " + id + " no longer exists.", enfe);
            }
            var paciente = controleSeguimento.getPaciente();
            if (paciente != null) {
                paciente.setControleSeguimento(null);
                paciente = em.merge(paciente);
            }
            em.remove(controleSeguimento);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ControleSeguimento> findControleSeguimentoEntities() {
        return findControleSeguimentoEntities(true, -1, -1);
    }

    public List<ControleSeguimento> findControleSeguimentoEntities(int maxResults, int firstResult) {
        return findControleSeguimentoEntities(false, maxResults, firstResult);
    }

    private List<ControleSeguimento> findControleSeguimentoEntities(boolean all, int maxResults, int firstResult) {
        var em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ControleSeguimento.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public ControleSeguimento findControleSeguimento(String id) {
        var em = getEntityManager();
        try {
            return em.find(ControleSeguimento.class, id);
        } finally {
            em.close();
        }
    }

    public int getControleSeguimentoCount() {
        var em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ControleSeguimento> rt = cq.from(ControleSeguimento.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Number) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
