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
@Table(name = "consulta_historico", catalog = "bdsyspi")
public class ConsultaHistorico implements java.io.Serializable {

    private Integer id;
    private Consulta consulta;
    private Crianca crianca;

    public ConsultaHistorico() {
    }

    public ConsultaHistorico(Consulta consulta, Crianca crianca) {
        this.consulta = consulta;
        this.crianca = crianca;
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
    @JoinColumn(name = "consulta_historico_id", nullable = false)
    public Consulta getConsulta() {
        return this.consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "crianca_id", nullable = false)
    public Crianca getCrianca() {
        return this.crianca;
    }

    public void setCrianca(Crianca crianca) {
        this.crianca = crianca;
    }

}
