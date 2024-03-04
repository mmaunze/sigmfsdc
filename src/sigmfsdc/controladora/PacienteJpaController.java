package sigmfsdc.controladora;

import java.io.Serializable;
import java.util.ArrayList;
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import static java.util.Calendar.getInstance;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import static javax.persistence.TemporalType.DATE;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import sigmfsdc.controladora.exceptions.IllegalOrphanException;
import sigmfsdc.controladora.exceptions.NonexistentEntityException;
import sigmfsdc.controladora.exceptions.PreexistingEntityException;
import sigmfsdc.modelo.Paciente;

/**
 *
 * @author Meldo Maunze
 */
public class PacienteJpaController implements Serializable {

    private static final Logger LOG = Logger.getLogger(PacienteJpaController.class.getName());

    private EntityManagerFactory emf = null;

    public PacienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Paciente paciente) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            var localTrabalhoResidencia = paciente.getLocalTrabalhoResidencia();
            if (localTrabalhoResidencia != null) {
                localTrabalhoResidencia = em.getReference(localTrabalhoResidencia.getClass(), localTrabalhoResidencia.getNid());
                paciente.setLocalTrabalhoResidencia(localTrabalhoResidencia);
            }
            var controleSeguimento = paciente.getControleSeguimento();
            if (controleSeguimento != null) {
                controleSeguimento = em.getReference(controleSeguimento.getClass(), controleSeguimento.getNid());
                paciente.setControleSeguimento(controleSeguimento);
            }
            em.persist(paciente);
            if (localTrabalhoResidencia != null) {
                var oldPacienteOfLocalTrabalhoResidencia = localTrabalhoResidencia.getPaciente();
                if (oldPacienteOfLocalTrabalhoResidencia != null) {
                    oldPacienteOfLocalTrabalhoResidencia.setLocalTrabalhoResidencia(null);
                    oldPacienteOfLocalTrabalhoResidencia = em.merge(oldPacienteOfLocalTrabalhoResidencia);
                }
                localTrabalhoResidencia.setPaciente(paciente);
                localTrabalhoResidencia = em.merge(localTrabalhoResidencia);
            }
            if (controleSeguimento != null) {
                var oldPacienteOfControleSeguimento = controleSeguimento.getPaciente();
                if (oldPacienteOfControleSeguimento != null) {
                    oldPacienteOfControleSeguimento.setControleSeguimento(null);
                    oldPacienteOfControleSeguimento = em.merge(oldPacienteOfControleSeguimento);
                }
                controleSeguimento.setPaciente(paciente);
                controleSeguimento = em.merge(controleSeguimento);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPaciente(paciente.getNid()) != null) {
                throw new PreexistingEntityException("Paciente " + paciente + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Paciente paciente) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            var persistentPaciente = em.find(Paciente.class, paciente.getNid());
            var localTrabalhoResidenciaOld = persistentPaciente.getLocalTrabalhoResidencia();
            var localTrabalhoResidenciaNew = paciente.getLocalTrabalhoResidencia();
            var controleSeguimentoOld = persistentPaciente.getControleSeguimento();
            var controleSeguimentoNew = paciente.getControleSeguimento();
            List<String> illegalOrphanMessages = null;
            if (localTrabalhoResidenciaOld != null && !localTrabalhoResidenciaOld.equals(localTrabalhoResidenciaNew)) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<>();
                }
                illegalOrphanMessages.add("You must retain LocalTrabalhoResidencia " + localTrabalhoResidenciaOld + " since its paciente field is not nullable.");
            }
            if (controleSeguimentoOld != null && !controleSeguimentoOld.equals(controleSeguimentoNew)) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<>();
                }
                illegalOrphanMessages.add("You must retain ControleSeguimento " + controleSeguimentoOld + " since its paciente field is not nullable.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (localTrabalhoResidenciaNew != null) {
                localTrabalhoResidenciaNew = em.getReference(localTrabalhoResidenciaNew.getClass(), localTrabalhoResidenciaNew.getNid());
                paciente.setLocalTrabalhoResidencia(localTrabalhoResidenciaNew);
            }
            if (controleSeguimentoNew != null) {
                controleSeguimentoNew = em.getReference(controleSeguimentoNew.getClass(), controleSeguimentoNew.getNid());
                paciente.setControleSeguimento(controleSeguimentoNew);
            }
            paciente = em.merge(paciente);
            if (localTrabalhoResidenciaNew != null && !localTrabalhoResidenciaNew.equals(localTrabalhoResidenciaOld)) {
                var oldPacienteOfLocalTrabalhoResidencia = localTrabalhoResidenciaNew.getPaciente();
                if (oldPacienteOfLocalTrabalhoResidencia != null) {
                    oldPacienteOfLocalTrabalhoResidencia.setLocalTrabalhoResidencia(null);
                    oldPacienteOfLocalTrabalhoResidencia = em.merge(oldPacienteOfLocalTrabalhoResidencia);
                }
                localTrabalhoResidenciaNew.setPaciente(paciente);
                localTrabalhoResidenciaNew = em.merge(localTrabalhoResidenciaNew);
            }
            if (controleSeguimentoNew != null && !controleSeguimentoNew.equals(controleSeguimentoOld)) {
                var oldPacienteOfControleSeguimento = controleSeguimentoNew.getPaciente();
                if (oldPacienteOfControleSeguimento != null) {
                    oldPacienteOfControleSeguimento.setControleSeguimento(null);
                    oldPacienteOfControleSeguimento = em.merge(oldPacienteOfControleSeguimento);
                }
                controleSeguimentoNew.setPaciente(paciente);
                controleSeguimentoNew = em.merge(controleSeguimentoNew);
            }
            em.getTransaction().commit();
        } catch (IllegalOrphanException ex) {
            var msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                var id = paciente.getNid();
                if (findPaciente(id) == null) {
                    throw new NonexistentEntityException("The paciente with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws IllegalOrphanException, NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Paciente paciente;
            try {
                paciente = em.getReference(Paciente.class, id);
                paciente.getNid();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The paciente with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            var localTrabalhoResidenciaOrphanCheck = paciente.getLocalTrabalhoResidencia();
            if (localTrabalhoResidenciaOrphanCheck != null) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<>();
                }
                illegalOrphanMessages.add("This Paciente (" + paciente + ") cannot be destroyed since the LocalTrabalhoResidencia " + localTrabalhoResidenciaOrphanCheck + " in its localTrabalhoResidencia field has a non-nullable paciente field.");
            }
            var controleSeguimentoOrphanCheck = paciente.getControleSeguimento();
            if (controleSeguimentoOrphanCheck != null) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<>();
                }
                illegalOrphanMessages.add("This Paciente (" + paciente + ") cannot be destroyed since the ControleSeguimento " + controleSeguimentoOrphanCheck + " in its controleSeguimento field has a non-nullable paciente field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(paciente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Paciente> findPacienteEntities() {
        return findPacienteEntities(true, -1, -1);
    }

    public List<Paciente> findPacienteEntities(int maxResults, int firstResult) {
        return findPacienteEntities(false, maxResults, firstResult);
    }

    private List<Paciente> findPacienteEntities(boolean all, int maxResults, int firstResult) {
        var em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Paciente.class));
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

    public Paciente findPaciente(String id) {
        var em = getEntityManager();
        try {
            return em.find(Paciente.class, id);
        } finally {
            em.close();
        }
    }

    private Date converterParaData(int ano, int mes, int dia) {
        var calendar = getInstance();
        calendar.set(YEAR, ano);
        calendar.set(MONTH, mes - 1); // Mês em Java é baseado em zero (janeiro = 0, fevereiro = 1, ...)
        calendar.set(DAY_OF_MONTH, dia);
        return calendar.getTime();
    }

    public List<Paciente> findPacientesPorPeriodo(int ano, int mesInicio, int mesFim) {
        var em = getEntityManager();
        var dataInicio = converterParaData(ano, mesInicio, 1);
        var dataFim = converterParaData(ano, mesFim, 28);
        try {
            // Consulta JPQL para obter pacientes dentro do período especificado
            var query = em.createQuery(
                    "SELECT p FROM Paciente p "
                    + "WHERE p.dataRegistoCaso >= :dataInicio AND p.dataRegistoCaso <= :dataFim "
                    + "ORDER BY p.dataRegistoCaso",
                    Paciente.class);
            query.setParameter("dataInicio", dataInicio, DATE);
            query.setParameter("dataFim", dataFim, DATE);

            // Executa a consulta
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    public int getPacienteCount() {
        var em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Paciente> rt = cq.from(Paciente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Number) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
