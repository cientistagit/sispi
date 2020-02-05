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
@Table(name = "acs", catalog = "bdsyspi")
public class Acs implements java.io.Serializable {

    private Integer id;
    private String nome;
    private String sexo;
    private Boolean situacao;
    private Set<Responsavel> responsavels = new HashSet<Responsavel>(0);

    public Acs() {
    }

    public Acs(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public Acs(String nome, String sexo, Boolean situacao, Set<Responsavel> responsavels) {
        this.nome = nome;
        this.sexo = sexo;
        this.situacao = situacao;
        this.responsavels = responsavels;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "acs")
    public Set<Responsavel> getResponsavels() {
        return this.responsavels;
    }

    public void setResponsavels(Set<Responsavel> responsavels) {
        this.responsavels = responsavels;
    }

}
