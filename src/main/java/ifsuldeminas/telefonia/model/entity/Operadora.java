package ifsuldeminas.telefonia.model.entity;

import ifsuldeminas.telefonia.model.entity.comercial.Celular;
import ifsuldeminas.telefonia.model.entity.comercial.Plano;
import ifsuldeminas.telefonia.model.entity.pessoal.Cliente;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Operadora {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    @OneToMany
    @JoinColumn(name = "operadora_id")
    private Set<Cliente> clientes;
    @OneToMany
    @JoinColumn(name = "operadora_id")
    private Set<Plano> planos;
    @OneToMany
    @JoinColumn(name = "operadora_id")
    private Set<Celular> celulares;
}
