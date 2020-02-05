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
@Table(name = "tempo_vida_imunizacao", catalog = "bdsyspi")
public class TempoVidaImunizacao implements java.io.Serializable {

    private Integer id;
    private int tempoVidaImunizacao;
    private Set<Imunizacao> imunizacaos = new HashSet<Imunizacao>(0);

    public TempoVidaImunizacao() {
    }

    public TempoVidaImunizacao(int tempoVidaImunizacao) {
        this.tempoVidaImunizacao = tempoVidaImunizacao;
    }

    public TempoVidaImunizacao(int tempoVidaImunizacao, Set<Imunizacao> imunizacaos) {
        this.tempoVidaImunizacao = tempoVidaImunizacao;
        this.imunizacaos = imunizacaos;
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

    @Column(name = "tempo_vida_imunizacao", nullable = false)
    public int getTempoVidaImunizacao() {
        return this.tempoVidaImunizacao;
    }

    public void setTempoVidaImunizacao(int tempoVidaImunizacao) {
        this.tempoVidaImunizacao = tempoVidaImunizacao;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tempoVidaImunizacao")
    public Set<Imunizacao> getImunizacaos() {
        return this.imunizacaos;
    }

    public void setImunizacaos(Set<Imunizacao> imunizacaos) {
        this.imunizacaos = imunizacaos;
    }

}
