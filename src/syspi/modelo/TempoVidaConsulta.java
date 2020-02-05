package syspi.modelo;

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

@Entity
@Table(name = "tempo_vida_consulta", catalog = "bdsyspi")
public class TempoVidaConsulta implements java.io.Serializable {

    private Integer id;
    private TipoProfissional tipoProfissional;
    private int tempoVidaConsulta;
    private Set<Consulta> consultas = new HashSet<Consulta>(0);

    public TempoVidaConsulta() {
    }

    public TempoVidaConsulta(TipoProfissional tipoProfissional, int tempoVidaConsulta) {
        this.tipoProfissional = tipoProfissional;
        this.tempoVidaConsulta = tempoVidaConsulta;
    }

    public TempoVidaConsulta(TipoProfissional tipoProfissional, int tempoVidaConsulta, Set<Consulta> consultas) {
        this.tipoProfissional = tipoProfissional;
        this.tempoVidaConsulta = tempoVidaConsulta;
        this.consultas = consultas;
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
    @JoinColumn(name = "tipo_profissional_id", nullable = false)
    public TipoProfissional getTipoProfissional() {
        return this.tipoProfissional;
    }

    public void setTipoProfissional(TipoProfissional tipoProfissional) {
        this.tipoProfissional = tipoProfissional;
    }

    @Column(name = "tempo_vida_consulta", nullable = false)
    public int getTempoVidaConsulta() {
        return this.tempoVidaConsulta;
    }

    public void setTempoVidaConsulta(int tempoVidaConsulta) {
        this.tempoVidaConsulta = tempoVidaConsulta;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tempoVidaConsulta")
    public Set<Consulta> getConsultas() {
        return this.consultas;
    }

    public void setConsultas(Set<Consulta> consultas) {
        this.consultas = consultas;
    }

}
