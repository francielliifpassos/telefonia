package ifsuldeminas.telefonia.model;

import ifsuldeminas.telefonia.model.comercial.Celular;
import ifsuldeminas.telefonia.model.comercial.Plano;
import ifsuldeminas.telefonia.model.pessoal.Cliente;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Operadora {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    @OneToMany(mappedBy = "operadora")
    private List<Cliente> clientes;
    @OneToMany(mappedBy = "operadora")
    private List<Celular> celulares;
    @OneToMany(mappedBy = "operadora")
    private List<Plano> planos;

    public Operadora(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Celular> getCelulares() {
        return celulares;
    }

    public void setCelulares(List<Celular> celulares) {
        this.celulares = celulares;
    }

    public List<Plano> getPlanos() {
        return planos;
    }

    public void setPlanos(List<Plano> planos) {
        this.planos = planos;
    }
}
