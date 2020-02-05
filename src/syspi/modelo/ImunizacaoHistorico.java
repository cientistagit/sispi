package syspi.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "imunizacao_historico", catalog = "bdsyspi")
public class ImunizacaoHistorico implements java.io.Serializable {

    private Integer id;
    private Crianca crianca;
    private Imunizacao imunizacao;

    public ImunizacaoHistorico() {
    }

    public ImunizacaoHistorico(Crianca crianca, Imunizacao imunizacao) {
        this.crianca = crianca;
        this.imunizacao = imunizacao;
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
    @JoinColumn(name = "crianca_id", nullable = false)
    public Crianca getCrianca() {
        return this.crianca;
    }

    public void setCrianca(Crianca crianca) {
        this.crianca = crianca;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "imunizacao_historico_id", nullable = false)
    public Imunizacao getImunizacao() {
        return this.imunizacao;
    }

    public void setImunizacao(Imunizacao imunizacao) {
        this.imunizacao = imunizacao;
    }

}