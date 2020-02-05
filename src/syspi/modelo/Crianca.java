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
@Table(name = "crianca", catalog = "bdsyspi")
public class Crianca implements java.io.Serializable {

    private Integer id;
    private Responsavel responsavel;
    private String nome;
    private Date nascimento;
    private String sexo;
    private Boolean situacao;
    private Boolean situacaoEspecial;
    private Set<ImunizacaoHistorico> imunizacaoHistoricos = new HashSet<ImunizacaoHistorico>(0);
    private Set<ConsultaHistorico> consultaHistoricos = new HashSet<ConsultaHistorico>(0);

    public Crianca() {
    }

    public Crianca(Responsavel responsavel, String nome, Date nascimento, String sexo) {
        this.responsavel = responsavel;
        this.nome = nome;
        this.nascimento = nascimento;
        this.sexo = sexo;
    }

    public Crianca(Responsavel responsavel, String nome, Date nascimento, String sexo, Boolean situacao, Boolean situacaoEspecial, Set<ImunizacaoHistorico> imunizacaoHistoricos, Set<ConsultaHistorico> consultaHistoricos) {
        this.responsavel = responsavel;
        this.nome = nome;
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.situacao = situacao;
        this.situacaoEspecial = situacaoEspecial;
        this.imunizacaoHistoricos = imunizacaoHistoricos;
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
    @JoinColumn(name = "responsavel_id", nullable = false)
    public Responsavel getResponsavel() {
        return this.responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    @Column(name = "nome", nullable = false)
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "nascimento", nullable = false, length = 10)
    public Date getNascimento() {
        return this.nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
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

    @Column(name = "situacao_especial")
    public Boolean getSituacaoEspecial() {
        return this.situacaoEspecial;
    }

    public void setSituacaoEspecial(Boolean situacaoEspecial) {
        this.situacaoEspecial = situacaoEspecial;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "crianca")
    public Set<ImunizacaoHistorico> getImunizacaoHistoricos() {
        return this.imunizacaoHistoricos;
    }

    public void setImunizacaoHistoricos(Set<ImunizacaoHistorico> imunizacaoHistoricos) {
        this.imunizacaoHistoricos = imunizacaoHistoricos;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "crianca")
    public Set<ConsultaHistorico> getConsultaHistoricos() {
        return this.consultaHistoricos;
    }

    public void setConsultaHistoricos(Set<ConsultaHistorico> consultaHistoricos) {
        this.consultaHistoricos = consultaHistoricos;
    }

}
