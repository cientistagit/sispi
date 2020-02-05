package syspi.modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "consulta", catalog = "bdsyspi"
)
public class Consulta implements java.io.Serializable {

    private Integer id;
    private TempoVidaConsulta tempoVidaConsulta;
    private Date data;
    private Boolean situacao;
    private Set<ConsultaHistorico> consultaHistoricos = new HashSet<ConsultaHistorico>(0);

    public Consulta() {
    }

    public Consulta(TempoVidaConsulta tempoVidaConsulta, Date data) {
        this.tempoVidaConsulta = tempoVidaConsulta;
        this.data = data;
    }

    public Consulta(TempoVidaConsulta tempoVidaConsulta, Date data, Boolean situacao, Set<ConsultaHistorico> consultaHistoricos) {
        this.tempoVidaConsulta = tempoVidaConsulta;
        this.data = data;
        this.situacao = situacao;
        this.consultaHistoricos = consultaHistoricos;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tempo_vida_consulta_id", nullable = false)
    public TempoVidaConsulta getTempoVidaConsulta() {
        return this.tempoVidaConsulta;
    }

    public void setTempoVidaConsulta(TempoVidaConsulta tempoVidaConsulta) {
        this.tempoVidaConsulta = tempoVidaConsulta;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "data", nullable = false, length = 10)
    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Column(name = "situacao")
    public Boolean getSituacao() {
        return this.situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "consulta")
    public Set<ConsultaHistorico> getConsultaHistoricos() {
        return this.consultaHistoricos;
    }

    public void setConsultaHistoricos(Set<ConsultaHistorico> consultaHistoricos) {
        this.consultaHistoricos = consultaHistoricos;
    }

}
