package ifsuldeminas.telefonia.model.entity.comercial;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Plano {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private double valorPorMinuto;
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
