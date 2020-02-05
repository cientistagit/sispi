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
@Table(name = "responsavel", catalog = "bdsyspi")
public class Responsavel implements java.io.Serializable {

    private Integer id;
    private Acs acs;
    private String nome;
    private String sexo;
    private Boolean situacao;
    private Set<Crianca> criancas = new HashSet<Crianca>(0);

    public Responsavel() {
    }

    public Responsavel(Acs acs, String nome, String sexo) {
        this.acs = acs;
        this.nome = nome;
        this.sexo = sexo;
    }

    public Responsavel(Acs acs, String nome, String sexo, Boolean situacao, Set<Crianca> criancas) {
        this.acs = acs;
        this.nome = nome;
        this.sexo = sexo;
        this.situacao = situacao;
        this.criancas = criancas;
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
    @JoinColumn(name = "acs_id", nullable = false)
    public Acs getAcs() {
        return this.acs;
    }

    public void setAcs(Acs acs) {
        this.acs = acs;
    }

    @Column(name = "nome", nullable = false)
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "sexo", nullable = false, length = 9)
    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Column(name = "situacao")
    public Boolean getSituacao() {
        return this.situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "responsavel")
    public Set<Crianca> getCriancas() {
        return this.criancas;
    }

    public void setCriancas(Set<Crianca> criancas) {
        this.criancas = criancas;
    }

}
