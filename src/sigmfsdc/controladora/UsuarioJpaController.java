
package sigmfsdc.controladora;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import sigmfsdc.controladora.exceptions.NonexistentEntityException;
import sigmfsdc.modelo.Usuario;

public class UsuarioJpaController implements Serializable {

    private static final Logger LOG = Logger.getLogger(UsuarioJpaController.class.getName());
    private EntityManagerFactory emf = null;
    public UsuarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Usuario usuario) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            var idInstituicao = usuario.getIdInstituicao();
            if (idInstituicao != null) {
                idInstituicao = em.getReference(idInstituicao.getClass(), idInstituicao.getIdInstituicao());
                usuario.setIdInstituicao(idInstituicao);
            }
            em.persist(usuario);
            if (idInstituicao != null) {
                idInstituicao.getUsuarioList().add(usuario);
                idInstituicao = em.merge(idInstituicao);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Usuario usuario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            var persistentUsuario = em.find(Usuario.class, usuario.getIdUsuario());
            var idInstituicaoOld = persistentUsuario.getIdInstituicao();
            var idInstituicaoNew = usuario.getIdInstituicao();
            if (idInstituicaoNew != null) {
                idInstituicaoNew = em.getReference(idInstituicaoNew.getClass(), idInstituicaoNew.getIdInstituicao());
                usuario.setIdInstituicao(idInstituicaoNew);
            }
            usuario = em.merge(usuario);
            if (idInstituicaoOld != null && !idInstituicaoOld.equals(idInstituicaoNew)) {
                idInstituicaoOld.getUsuarioList().remove(usuario);
                idInstituicaoOld = em.merge(idInstituicaoOld);
            }
            if (idInstituicaoNew != null && !idInstituicaoNew.equals(idInstituicaoOld)) {
                idInstituicaoNew.getUsuarioList().add(usuario);
                idInstituicaoNew = em.merge(idInstituicaoNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            var msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                var id = usuario.getIdUsuario();
                if (findUsuario(id) == null) {
                    throw new NonexistentEntityException("The usuario with id " + id + " no longer exists.");
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
            Usuario usuario;
            try {
                usuario = em.getReference(Usuario.class, id);
                usuario.getIdUsuario();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The usuario with id " + id + " no longer exists.", enfe);
            }
            var idInstituicao = usuario.getIdInstituicao();
            if (idInstituicao != null) {
                idInstituicao.getUsuarioList().remove(usuario);
                idInstituicao = em.merge(idInstituicao);
            }
            em.remove(usuario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Usuario> findUsuarioEntities() {
        return findUsuarioEntities(true, -1, -1);
    }

    public List<Usuario> findUsuarioEntities(int maxResults, int firstResult) {
        return findUsuarioEntities(false, maxResults, firstResult);
    }

    private List<Usuario> findUsuarioEntities(boolean all, int maxResults, int firstResult) {
        var em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Usuario.class));
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

    public Usuario findUsuario(Integer id) {
        var em = getEntityManager();
        try {
            return em.find(Usuario.class, id);
        } finally {
            em.close();
        }
    }

    public int getUsuarioCount() {
        var em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Usuario> rt = cq.from(Usuario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Number) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
