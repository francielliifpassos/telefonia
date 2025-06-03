package ifsuldeminas.telefonia.model.entity.comercial;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Plano {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @DecimalMin(value = "1.49")
    private double valorPorMinuto;
    @NotNull
    @NotBlank
    private String nome;

    public Plano(){

    }

    public long getId() {
        return id;
    }

    public double getValorPorMinuto() {
        return valorPorMinuto;
    }

    public void setValorPorMinuto(double valorPorMinuto) {
        this.valorPorMinuto = valorPorMinuto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
