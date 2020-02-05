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
@Table(name = "imunizacao", catalog = "bdsyspi")
public class Imunizacao implements java.io.Serializable {

    private Integer id;
    private TempoVidaImunizacao tempoVidaImunizacao;
    private Date data;
    private Boolean situacao;
    private Set<ImunizacaoHistorico> imunizacaoHistoricos = new HashSet<ImunizacaoHistorico>(0);

    public Imunizacao() {
    }

    public Imunizacao(TempoVidaImunizacao tempoVidaImunizacao, Date data) {
        this.tempoVidaImunizacao = tempoVidaImunizacao;
        this.data = data;
    }

    public Imunizacao(TempoVidaImunizacao tempoVidaImunizacao, Date data, Boolean situacao, Set<ImunizacaoHistorico> imunizacaoHistoricos) {
        this.tempoVidaImunizacao = tempoVidaImunizacao;
        this.data = data;
        this.situacao = situacao;
        this.imunizacaoHistoricos = imunizacaoHistoricos;
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
    @JoinColumn(name = "tempo_vida_imunizacao_id", nullable = false)
    public TempoVidaImunizacao getTempoVidaImunizacao() {
        return this.tempoVidaImunizacao;
    }

    public void setTempoVidaImunizacao(TempoVidaImunizacao tempoVidaImunizacao) {
        this.tempoVidaImunizacao = tempoVidaImunizacao;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "imunizacao")
    public Set<ImunizacaoHistorico> getImunizacaoHistoricos() {
        return this.imunizacaoHistoricos;
    }

    public void setImunizacaoHistoricos(Set<ImunizacaoHistorico> imunizacaoHistoricos) {
        this.imunizacaoHistoricos = imunizacaoHistoricos;
    }

}
