
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
import sigmfsdc.controladora.exceptions.NonexistentEntityException;
import sigmfsdc.modelo.Instituicao;
import sigmfsdc.modelo.Usuario;

/**
 *
 * @author Meldo Maunze
 */
public class InstituicaoJpaController implements Serializable {

    private static final Logger LOG = Logger.getLogger(InstituicaoJpaController.class.getName());
    private EntityManagerFactory emf = null;
    public InstituicaoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Instituicao instituicao) {
        if (instituicao.getUsuarioList() == null) {
            instituicao.setUsuarioList(new ArrayList<>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Usuario> attachedUsuarioList = new ArrayList<>();
            for (var usuarioListUsuarioToAttach : instituicao.getUsuarioList()) {
                usuarioListUsuarioToAttach = em.getReference(usuarioListUsuarioToAttach.getClass(), usuarioListUsuarioToAttach.getIdUsuario());
                attachedUsuarioList.add(usuarioListUsuarioToAttach);
            }
            instituicao.setUsuarioList(attachedUsuarioList);
            em.persist(instituicao);
            for (var usuarioListUsuario : instituicao.getUsuarioList()) {
                var oldIdInstituicaoOfUsuarioListUsuario = usuarioListUsuario.getIdInstituicao();
                usuarioListUsuario.setIdInstituicao(instituicao);
                usuarioListUsuario = em.merge(usuarioListUsuario);
                if (oldIdInstituicaoOfUsuarioListUsuario != null) {
                    oldIdInstituicaoOfUsuarioListUsuario.getUsuarioList().remove(usuarioListUsuario);
                    oldIdInstituicaoOfUsuarioListUsuario = em.merge(oldIdInstituicaoOfUsuarioListUsuario);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Instituicao instituicao) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            var persistentInstituicao = em.find(Instituicao.class, instituicao.getIdInstituicao());
            var usuarioListOld = persistentInstituicao.getUsuarioList();
            var usuarioListNew = instituicao.getUsuarioList();
            List<Usuario> attachedUsuarioListNew = new ArrayList<>();
            for (var usuarioListNewUsuarioToAttach : usuarioListNew) {
                usuarioListNewUsuarioToAttach = em.getReference(usuarioListNewUsuarioToAttach.getClass(), usuarioListNewUsuarioToAttach.getIdUsuario());
                attachedUsuarioListNew.add(usuarioListNewUsuarioToAttach);
            }
            usuarioListNew = attachedUsuarioListNew;
            instituicao.setUsuarioList(usuarioListNew);
            instituicao = em.merge(instituicao);
            for (var usuarioListOldUsuario : usuarioListOld) {
                if (!usuarioListNew.contains(usuarioListOldUsuario)) {
                    usuarioListOldUsuario.setIdInstituicao(null);
                    usuarioListOldUsuario = em.merge(usuarioListOldUsuario);
                }
            }
            for (var usuarioListNewUsuario : usuarioListNew) {
                if (!usuarioListOld.contains(usuarioListNewUsuario)) {
                    var oldIdInstituicaoOfUsuarioListNewUsuario = usuarioListNewUsuario.getIdInstituicao();
                    usuarioListNewUsuario.setIdInstituicao(instituicao);
                    usuarioListNewUsuario = em.merge(usuarioListNewUsuario);
                    if (oldIdInstituicaoOfUsuarioListNewUsuario != null && !oldIdInstituicaoOfUsuarioListNewUsuario.equals(instituicao)) {
                        oldIdInstituicaoOfUsuarioListNewUsuario.getUsuarioList().remove(usuarioListNewUsuario);
                        oldIdInstituicaoOfUsuarioListNewUsuario = em.merge(oldIdInstituicaoOfUsuarioListNewUsuario);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            var msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                var id = instituicao.getIdInstituicao();
                if (findInstituicao(id) == null) {
                    throw new NonexistentEntityException("The instituicao with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Instituicao instituicao;
            try {
                instituicao = em.getReference(Instituicao.class, id);
                instituicao.getIdInstituicao();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The instituicao with id " + id + " no longer exists.", enfe);
            }
            var usuarioList = instituicao.getUsuarioList();
            for (var usuarioListUsuario : usuarioList) {
                usuarioListUsuario.setIdInstituicao(null);
                usuarioListUsuario = em.merge(usuarioListUsuario);
            }
            em.remove(instituicao);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Instituicao> findInstituicaoEntities() {
        return findInstituicaoEntities(true, -1, -1);
    }

    public List<Instituicao> findInstituicaoEntities(int maxResults, int firstResult) {
        return findInstituicaoEntities(false, maxResults, firstResult);
    }

    private List<Instituicao> findInstituicaoEntities(boolean all, int maxResults, int firstResult) {
        var em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Instituicao.class));
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

    public Instituicao findInstituicao(Integer id) {
        var em = getEntityManager();
        try {
            return em.find(Instituicao.class, id);
        } finally {
            em.close();
        }
    }

    public int getInstituicaoCount() {
        var em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Instituicao> rt = cq.from(Instituicao.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Number) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
