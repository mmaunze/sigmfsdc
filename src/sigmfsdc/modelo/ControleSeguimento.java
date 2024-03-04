
package sigmfsdc.modelo;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import static javax.persistence.TemporalType.DATE;

@Entity
@Table(name = "controle_seguimento", catalog = "Sistemaigmfsdc", schema = "")
@NamedQueries({
    @NamedQuery(name = "ControleSeguimento.findAll", query = "SELECT c FROM ControleSeguimento c"),
    @NamedQuery(name = "ControleSeguimento.findByNid", query = "SELECT c FROM ControleSeguimento c WHERE c.nid = :nid"),
    @NamedQuery(name = "ControleSeguimento.findByConsultaMedica", query = "SELECT c FROM ControleSeguimento c WHERE c.consultaMedica = :consultaMedica"),
    @NamedQuery(name = "ControleSeguimento.findByEnfermidade", query = "SELECT c FROM ControleSeguimento c WHERE c.enfermidade = :enfermidade"),
    @NamedQuery(name = "ControleSeguimento.findByRastreio", query = "SELECT c FROM ControleSeguimento c WHERE c.rastreio = :rastreio"),
    @NamedQuery(name = "ControleSeguimento.findByDiagnostico", query = "SELECT c FROM ControleSeguimento c WHERE c.diagnostico = :diagnostico"),
    @NamedQuery(name = "ControleSeguimento.findByAon", query = "SELECT c FROM ControleSeguimento c WHERE c.aon = :aon"),
    @NamedQuery(name = "ControleSeguimento.findByApss", query = "SELECT c FROM ControleSeguimento c WHERE c.apss = :apss"),
    @NamedQuery(name = "ControleSeguimento.findByEspAnteriorObservado", query = "SELECT c FROM ControleSeguimento c WHERE c.espAnteriorObservado = :espAnteriorObservado"),
    @NamedQuery(name = "ControleSeguimento.findByDataConsultaAnterior", query = "SELECT c FROM ControleSeguimento c WHERE c.dataConsultaAnterior = :dataConsultaAnterior"),
    @NamedQuery(name = "ControleSeguimento.findByEspAtualObservado", query = "SELECT c FROM ControleSeguimento c WHERE c.espAtualObservado = :espAtualObservado"),
    @NamedQuery(name = "ControleSeguimento.findByDataConsultaAtual", query = "SELECT c FROM ControleSeguimento c WHERE c.dataConsultaAtual = :dataConsultaAtual"),
    @NamedQuery(name = "ControleSeguimento.findByDataProximaConsulta", query = "SELECT c FROM ControleSeguimento c WHERE c.dataProximaConsulta = :dataProximaConsulta"),
    @NamedQuery(name = "ControleSeguimento.findByEspObservado", query = "SELECT c FROM ControleSeguimento c WHERE c.espObservado = :espObservado"),
    @NamedQuery(name = "ControleSeguimento.findBySituacaoAtualPaciente", query = "SELECT c FROM ControleSeguimento c WHERE c.situacaoAtualPaciente = :situacaoAtualPaciente"),
    @NamedQuery(name = "ControleSeguimento.findByDataFalecimento", query = "SELECT c FROM ControleSeguimento c WHERE c.dataFalecimento = :dataFalecimento")})
public class ControleSeguimento implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final Logger LOG = Logger.getLogger(ControleSeguimento.class.getName());
    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 5)
    private String nid;
    @Column(name = "consulta_medica", length = 100)
    private String consultaMedica;
    @Column(length = 100)
    private String enfermidade;
    @Column(length = 100)
    private String rastreio;
    @Column(length = 100)
    private String diagnostico;
    @Column(length = 100)
    private String aon;
    @Column(length = 100)
    private String apss;
    @Column(name = "esp_anterior_observado", length = 100)
    private String espAnteriorObservado;
    @Column(name = "data_consulta_anterior")
    @Temporal(DATE)
    private Date dataConsultaAnterior;
    @Column(name = "esp_atual_observado", length = 100)
    private String espAtualObservado;
    @Column(name = "data_consulta_atual")
    @Temporal(DATE)
    private Date dataConsultaAtual;
    @Column(name = "data_proxima_consulta")
    @Temporal(DATE)
    private Date dataProximaConsulta;
    @Column(name = "esp_observado", length = 100)
    private String espObservado;
    @Column(name = "situacao_atual_paciente", length = 50)
    private String situacaoAtualPaciente;
    @Column(name = "data_falecimento")
    @Temporal(DATE)
    private Date dataFalecimento;
    @JoinColumn(name = "nid", referencedColumnName = "nid", nullable = false, insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = LAZY)
    private Paciente paciente;

    public ControleSeguimento() {
    }

    public ControleSeguimento(String nid) {
        this.nid = nid;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getConsultaMedica() {
        return consultaMedica;
    }

    public void setConsultaMedica(String consultaMedica) {
        this.consultaMedica = consultaMedica;
    }

    public String getEnfermidade() {
        return enfermidade;
    }

    public void setEnfermidade(String enfermidade) {
        this.enfermidade = enfermidade;
    }

    public String getRastreio() {
        return rastreio;
    }

    public void setRastreio(String rastreio) {
        this.rastreio = rastreio;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getAon() {
        return aon;
    }

    public void setAon(String aon) {
        this.aon = aon;
    }

    public String getApss() {
        return apss;
    }

    public void setApss(String apss) {
        this.apss = apss;
    }

    public String getEspAnteriorObservado() {
        return espAnteriorObservado;
    }

    public void setEspAnteriorObservado(String espAnteriorObservado) {
        this.espAnteriorObservado = espAnteriorObservado;
    }

    public Date getDataConsultaAnterior() {
        return dataConsultaAnterior;
    }

    public void setDataConsultaAnterior(Date dataConsultaAnterior) {
        this.dataConsultaAnterior = dataConsultaAnterior;
    }

    public String getEspAtualObservado() {
        return espAtualObservado;
    }

    public void setEspAtualObservado(String espAtualObservado) {
        this.espAtualObservado = espAtualObservado;
    }

    public Date getDataConsultaAtual() {
        return dataConsultaAtual;
    }

    public void setDataConsultaAtual(Date dataConsultaAtual) {
        this.dataConsultaAtual = dataConsultaAtual;
    }

    public Date getDataProximaConsulta() {
        return dataProximaConsulta;
    }

    public void setDataProximaConsulta(Date dataProximaConsulta) {
        this.dataProximaConsulta = dataProximaConsulta;
    }

    public String getEspObservado() {
        return espObservado;
    }

    public void setEspObservado(String espObservado) {
        this.espObservado = espObservado;
    }

    public String getSituacaoAtualPaciente() {
        return situacaoAtualPaciente;
    }

    public void setSituacaoAtualPaciente(String situacaoAtualPaciente) {
        this.situacaoAtualPaciente = situacaoAtualPaciente;
    }

    public Date getDataFalecimento() {
        return dataFalecimento;
    }

    public void setDataFalecimento(Date dataFalecimento) {
        this.dataFalecimento = dataFalecimento;
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
        if (!(object instanceof ControleSeguimento)) {
            return false;
        }
        var other = (ControleSeguimento) object;
        return !((this.nid == null && other.nid != null) || (this.nid != null && !this.nid.equals(other.nid)));
    }

    @Override
    public String toString() {
        return "com.sistemaigmfsdc.sistemaigmfsdc.ControleSeguimento[ nid=" + nid + " ]";
    }
    
}
