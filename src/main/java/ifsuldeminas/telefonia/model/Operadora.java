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
    @OneToMany
    @JoinColumn(name = "operadora_id")
    private List<Plano> planos;
}
