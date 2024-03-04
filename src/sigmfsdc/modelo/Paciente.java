
package sigmfsdc.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.logging.Logger;
import javax.persistence.Basic;
import static javax.persistence.CascadeType.ALL;
import javax.persistence.Column;
import javax.persistence.Entity;
import static javax.persistence.FetchType.LAZY;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import static javax.persistence.TemporalType.DATE;


@Entity
@Table(catalog = "Sistemaigmfsdc", schema = "")
@NamedQueries({
    @NamedQuery(name = "Paciente.findAll", query = "SELECT p FROM Paciente p"),
    @NamedQuery(name = "Paciente.findByNid", query = "SELECT p FROM Paciente p WHERE p.nid = :nid"),
    @NamedQuery(name = "Paciente.findByDataRegistoCaso", query = "SELECT p FROM Paciente p WHERE p.dataRegistoCaso = :dataRegistoCaso"),
    @NamedQuery(name = "Paciente.findByNome", query = "SELECT p FROM Paciente p WHERE p.nome = :nome"),
    @NamedQuery(name = "Paciente.findBySexo", query = "SELECT p FROM Paciente p WHERE p.sexo = :sexo"),
    @NamedQuery(name = "Paciente.findByCarreira", query = "SELECT p FROM Paciente p WHERE p.carreira = :carreira"),
    @NamedQuery(name = "Paciente.findByNivelCarreira", query = "SELECT p FROM Paciente p WHERE p.nivelCarreira = :nivelCarreira"),
    @NamedQuery(name = "Paciente.findByCategoria", query = "SELECT p FROM Paciente p WHERE p.categoria = :categoria"),
    @NamedQuery(name = "Paciente.findByDataNascimento", query = "SELECT p FROM Paciente p WHERE p.dataNascimento = :dataNascimento"),
    @NamedQuery(name = "Paciente.findByIdade", query = "SELECT p FROM Paciente p WHERE p.idade = :idade"),
    @NamedQuery(name = "Paciente.findByFaixaEtaria", query = "SELECT p FROM Paciente p WHERE p.faixaEtaria = :faixaEtaria"),
    @NamedQuery(name = "Paciente.findByProvinciaNascimento", query = "SELECT p FROM Paciente p WHERE p.provinciaNascimento = :provinciaNascimento"),
    @NamedQuery(name = "Paciente.findByDistritoNascimento", query = "SELECT p FROM Paciente p WHERE p.distritoNascimento = :distritoNascimento"),
    @NamedQuery(name = "Paciente.findByUsAssistencia", query = "SELECT p FROM Paciente p WHERE p.usAssistencia = :usAssistencia"),
    @NamedQuery(name = "Paciente.findByLocalUs", query = "SELECT p FROM Paciente p WHERE p.localUs = :localUs")})
public class Paciente implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final Logger LOG = Logger.getLogger(Paciente.class.getName());
    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 5)
    private String nid;
    @Column(name = "data_registo_caso")
    @Temporal(DATE)
    private Date dataRegistoCaso;
    @Column(length = 255)
    private String nome;
    @Column(length = 10)
    private String sexo;
    @Column(length = 100)
    private String carreira;
    @Column(name = "nivel_carreira", length = 100)
    private String nivelCarreira;
    @Column(length = 100)
    private String categoria;
    @Column(name = "data_nascimento")
    @Temporal(DATE)
    private Date dataNascimento;
    private Integer idade;
    @Column(name = "faixa_etaria", length = 20)
    private String faixaEtaria;
    @Column(name = "provincia_nascimento", length = 50)
    private String provinciaNascimento;
    @Column(name = "distrito_nascimento", length = 50)
    private String distritoNascimento;
    @Column(name = "us_assistencia", length = 100)
    private String usAssistencia;
    @Column(name = "local_us", length = 100)
    private String localUs;
    @OneToOne(cascade = ALL, mappedBy = "paciente", fetch = LAZY)
    private LocalTrabalhoResidencia localTrabalhoResidencia;
    @OneToOne(cascade = ALL, mappedBy = "paciente", fetch = LAZY)
    private ControleSeguimento controleSeguimento;

    public Paciente() {
    }

    public Paciente(String nid) {
        this.nid = nid;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public Date getDataRegistoCaso() {
        return dataRegistoCaso;
    }

    public void setDataRegistoCaso(Date dataRegistoCaso) {
        this.dataRegistoCaso = dataRegistoCaso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCarreira() {
        return carreira;
    }

    public void setCarreira(String carreira) {
        this.carreira = carreira;
    }

    public String getNivelCarreira() {
        return nivelCarreira;
    }

    public void setNivelCarreira(String nivelCarreira) {
        this.nivelCarreira = nivelCarreira;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public String getProvinciaNascimento() {
        return provinciaNascimento;
    }

    public void setProvinciaNascimento(String provinciaNascimento) {
        this.provinciaNascimento = provinciaNascimento;
    }

    public String getDistritoNascimento() {
        return distritoNascimento;
    }

    public void setDistritoNascimento(String distritoNascimento) {
        this.distritoNascimento = distritoNascimento;
    }

    public String getUsAssistencia() {
        return usAssistencia;
    }

    public void setUsAssistencia(String usAssistencia) {
        this.usAssistencia = usAssistencia;
    }

    public String getLocalUs() {
        return localUs;
    }

    public void setLocalUs(String localUs) {
        this.localUs = localUs;
    }

    public LocalTrabalhoResidencia getLocalTrabalhoResidencia() {
        return localTrabalhoResidencia;
    }

    public void setLocalTrabalhoResidencia(LocalTrabalhoResidencia localTrabalhoResidencia) {
        this.localTrabalhoResidencia = localTrabalhoResidencia;
    }

    public ControleSeguimento getControleSeguimento() {
        return controleSeguimento;
    }

    public void setControleSeguimento(ControleSeguimento controleSeguimento) {
        this.controleSeguimento = controleSeguimento;
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
        if (!(object instanceof Paciente)) {
            return false;
        }
        var other = (Paciente) object;
        return !((this.nid == null && other.nid != null) || (this.nid != null && !this.nid.equals(other.nid)));
    }

    @Override
    public String toString() {
        return "com.sistemaigmfsdc.sistemaigmfsdc.Paciente[ nid=" + nid + " ]";
    }
    
}
