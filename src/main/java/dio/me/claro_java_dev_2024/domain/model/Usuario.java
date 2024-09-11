package dio.me.claro_java_dev_2024.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tabela_usuarios")
public class Usuario {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;
    private String name;


    @OneToOne(cascade = CascadeType.ALL)
    private Plano plano;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Funcao> funcoes;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Oferta> ofertas;

    public Usuario() {
    }

    public Usuario(Long id, String cpf,String name, Plano plano, List<Funcao> funcoes, List<Oferta> ofertas) {
        this.id = id;
        this.cpf = cpf;
        this.name = name;
        this.plano = plano;
        this.funcoes = funcoes;
        this.ofertas = ofertas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public List<Funcao> getFuncoes() {
        return funcoes;
    }

    public void setFuncoes(List<Funcao> funcoes) {
        this.funcoes = funcoes;
    }

    public List<Oferta> getOfertas() {
        return ofertas;
    }

    public void setOfertas(List<Oferta> ofertas) {
        this.ofertas = ofertas;
    }
}
