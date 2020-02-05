package syspi.modelo;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_profissional", catalog = "bdsyspi")
public class TipoProfissional implements java.io.Serializable {

    private Integer id;
    private String tipoProfissional;
    private Set<TempoVidaConsulta> tempoVidaConsultas = new HashSet<TempoVidaConsulta>(0);

    public TipoProfissional() {
    }

    public TipoProfissional(String tipoProfissional) {
        this.tipoProfissional = tipoProfissional;
    }

    public TipoProfissional(String tipoProfissional, Set<TempoVidaConsulta> tempoVidaConsultas) {
        this.tipoProfissional = tipoProfissional;
        this.tempoVidaConsultas = tempoVidaConsultas;
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

    @Column(name = "tipo_profissional", nullable = false, length = 45)
    public String getTipoProfissional() {
        return this.tipoProfissional;
    }

    public void setTipoProfissional(String tipoProfissional) {
        this.tipoProfissional = tipoProfissional;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoProfissional")
    public Set<TempoVidaConsulta> getTempoVidaConsultas() {
        return this.tempoVidaConsultas;
    }

    public void setTempoVidaConsultas(Set<TempoVidaConsulta> tempoVidaConsultas) {
        this.tempoVidaConsultas = tempoVidaConsultas;
    }

}
