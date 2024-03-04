
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
import sigmfsdc.modelo.LocalTrabalhoResidencia;

/**
 *
 * @author Meldo Maunze
 */
public class LocalTrabalhoResidenciaJpaController implements Serializable {
    private static final Logger LOG = Logger.getLogger(LocalTrabalhoResidenciaJpaController.class.getName());

    private EntityManagerFactory emf = null;
    public LocalTrabalhoResidenciaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(LocalTrabalhoResidencia localTrabalhoResidencia) throws IllegalOrphanException, PreexistingEntityException, Exception {
        List<String> illegalOrphanMessages = null;
        var pacienteOrphanCheck = localTrabalhoResidencia.getPaciente();
        if (pacienteOrphanCheck != null) {
            var oldLocalTrabalhoResidenciaOfPaciente = pacienteOrphanCheck.getLocalTrabalhoResidencia();
            if (oldLocalTrabalhoResidenciaOfPaciente != null) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<>();
                }
                illegalOrphanMessages.add("The Paciente " + pacienteOrphanCheck + " already has an item of type LocalTrabalhoResidencia whose paciente column cannot be null. Please make another selection for the paciente field.");
            }
        }
        if (illegalOrphanMessages != null) {
            throw new IllegalOrphanException(illegalOrphanMessages);
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            var paciente = localTrabalhoResidencia.getPaciente();
            if (paciente != null) {
                paciente = em.getReference(paciente.getClass(), paciente.getNid());
                localTrabalhoResidencia.setPaciente(paciente);
            }
            em.persist(localTrabalhoResidencia);
            if (paciente != null) {
                paciente.setLocalTrabalhoResidencia(localTrabalhoResidencia);
                paciente = em.merge(paciente);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findLocalTrabalhoResidencia(localTrabalhoResidencia.getNid()) != null) {
                throw new PreexistingEntityException("LocalTrabalhoResidencia " + localTrabalhoResidencia + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(LocalTrabalhoResidencia localTrabalhoResidencia) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            var persistentLocalTrabalhoResidencia = em.find(LocalTrabalhoResidencia.class, localTrabalhoResidencia.getNid());
            var pacienteOld = persistentLocalTrabalhoResidencia.getPaciente();
            var pacienteNew = localTrabalhoResidencia.getPaciente();
            List<String> illegalOrphanMessages = null;
            if (pacienteNew != null && !pacienteNew.equals(pacienteOld)) {
                var oldLocalTrabalhoResidenciaOfPaciente = pacienteNew.getLocalTrabalhoResidencia();
                if (oldLocalTrabalhoResidenciaOfPaciente != null) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<>();
                    }
                    illegalOrphanMessages.add("The Paciente " + pacienteNew + " already has an item of type LocalTrabalhoResidencia whose paciente column cannot be null. Please make another selection for the paciente field.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (pacienteNew != null) {
                pacienteNew = em.getReference(pacienteNew.getClass(), pacienteNew.getNid());
                localTrabalhoResidencia.setPaciente(pacienteNew);
            }
            localTrabalhoResidencia = em.merge(localTrabalhoResidencia);
            if (pacienteOld != null && !pacienteOld.equals(pacienteNew)) {
                pacienteOld.setLocalTrabalhoResidencia(null);
                pacienteOld = em.merge(pacienteOld);
            }
            if (pacienteNew != null && !pacienteNew.equals(pacienteOld)) {
                pacienteNew.setLocalTrabalhoResidencia(localTrabalhoResidencia);
                pacienteNew = em.merge(pacienteNew);
            }
            em.getTransaction().commit();
        } catch (IllegalOrphanException ex) {
            var msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                var id = localTrabalhoResidencia.getNid();
                if (findLocalTrabalhoResidencia(id) == null) {
                    throw new NonexistentEntityException("The localTrabalhoResidencia with id " + id + " no longer exists.");
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
            LocalTrabalhoResidencia localTrabalhoResidencia;
            try {
                localTrabalhoResidencia = em.getReference(LocalTrabalhoResidencia.class, id);
                localTrabalhoResidencia.getNid();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The localTrabalhoResidencia with id " + id + " no longer exists.", enfe);
            }
            var paciente = localTrabalhoResidencia.getPaciente();
            if (paciente != null) {
                paciente.setLocalTrabalhoResidencia(null);
                paciente = em.merge(paciente);
            }
            em.remove(localTrabalhoResidencia);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<LocalTrabalhoResidencia> findLocalTrabalhoResidenciaEntities() {
        return findLocalTrabalhoResidenciaEntities(true, -1, -1);
    }

    public List<LocalTrabalhoResidencia> findLocalTrabalhoResidenciaEntities(int maxResults, int firstResult) {
        return findLocalTrabalhoResidenciaEntities(false, maxResults, firstResult);
    }

    private List<LocalTrabalhoResidencia> findLocalTrabalhoResidenciaEntities(boolean all, int maxResults, int firstResult) {
        var em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(LocalTrabalhoResidencia.class));
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

    public LocalTrabalhoResidencia findLocalTrabalhoResidencia(String id) {
        var em = getEntityManager();
        try {
            return em.find(LocalTrabalhoResidencia.class, id);
        } finally {
            em.close();
        }
    }

    public int getLocalTrabalhoResidenciaCount() {
        var em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<LocalTrabalhoResidencia> rt = cq.from(LocalTrabalhoResidencia.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Number) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
