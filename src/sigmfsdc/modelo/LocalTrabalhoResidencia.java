
package sigmfsdc.modelo;

import java.io.Serializable;
import java.util.logging.Logger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import static javax.persistence.FetchType.LAZY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "local_trabalho_residencia", catalog = "Sistemaigmfsdc", schema = "")
@NamedQueries({
    @NamedQuery(name = "LocalTrabalhoResidencia.findAll", query = "SELECT l FROM LocalTrabalhoResidencia l"),
    @NamedQuery(name = "LocalTrabalhoResidencia.findByNid", query = "SELECT l FROM LocalTrabalhoResidencia l WHERE l.nid = :nid"),
    @NamedQuery(name = "LocalTrabalhoResidencia.findByProvincia", query = "SELECT l FROM LocalTrabalhoResidencia l WHERE l.provincia = :provincia"),
    @NamedQuery(name = "LocalTrabalhoResidencia.findByDistrito", query = "SELECT l FROM LocalTrabalhoResidencia l WHERE l.distrito = :distrito"),
    @NamedQuery(name = "LocalTrabalhoResidencia.findByEstabelecimentoSaude", query = "SELECT l FROM LocalTrabalhoResidencia l WHERE l.estabelecimentoSaude = :estabelecimentoSaude"),
    @NamedQuery(name = "LocalTrabalhoResidencia.findBySetorTrabalho", query = "SELECT l FROM LocalTrabalhoResidencia l WHERE l.setorTrabalho = :setorTrabalho"),
    @NamedQuery(name = "LocalTrabalhoResidencia.findByMorada", query = "SELECT l FROM LocalTrabalhoResidencia l WHERE l.morada = :morada")})
public class LocalTrabalhoResidencia implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final Logger LOG = Logger.getLogger(LocalTrabalhoResidencia.class.getName());
    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 5)
    private String nid;
    @Column(length = 50)
    private String provincia;
    @Column(length = 50)
    private String distrito;
    @Column(name = "estabelecimento_saude", length = 100)
    private String estabelecimentoSaude;
    @Column(name = "setor_trabalho", length = 100)
    private String setorTrabalho;
    @Column(length = 255)
    private String morada;
    @JoinColumn(name = "nid", referencedColumnName = "nid", nullable = false, insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = LAZY)
    private Paciente paciente;

    public LocalTrabalhoResidencia() {
    }

    public LocalTrabalhoResidencia(String nid) {
        this.nid = nid;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getEstabelecimentoSaude() {
        return estabelecimentoSaude;
    }

    public void setEstabelecimentoSaude(String estabelecimentoSaude) {
        this.estabelecimentoSaude = estabelecimentoSaude;
    }

    public String getSetorTrabalho() {
        return setorTrabalho;
    }

    public void setSetorTrabalho(String setorTrabalho) {
        this.setorTrabalho = setorTrabalho;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public int hashCode() {
        var hash = 0;
        hash += (nid != null ? nid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LocalTrabalhoResidencia)) {
            return false;
        }
        var other = (LocalTrabalhoResidencia) object;
        return !((this.nid == null && other.nid != null) || (this.nid != null && !this.nid.equals(other.nid)));
    }

    @Override
    public String toString() {
        return "com.sistemaigmfsdc.sistemaigmfsdc.LocalTrabalhoResidencia[ nid=" + nid + " ]";
    }
    
}
