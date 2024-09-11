package dio.me.claro_java_dev_2024.domain.model;


import jakarta.persistence.*;

@Entity(name = "tabela_Planos")
public class Plano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String numeroTelefone;

    private double gigas;

    public Plano() {}

    public Plano(Long id, String numeroTelefone, double gigas) {
        this.id = id;
        this.numeroTelefone = numeroTelefone;
        this.gigas = gigas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public double getGigas() {
        return gigas;
    }

    public void setGigas(double gigas) {
        this.gigas = gigas;
    }
}
