package ifsuldeminas.bcc.telefonia.model.entity;

import ifsuldeminas.bcc.telefonia.model.entity.comercial.Celular;
import ifsuldeminas.bcc.telefonia.model.entity.comercial.Plano;
import ifsuldeminas.bcc.telefonia.model.entity.pessoal.Cliente;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Operadora {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    @OneToMany
    @JoinColumn(name="operadora_id")
    private Set<Cliente> clientes;
    @OneToMany
    @JoinColumn(name="operadora_id")
    private Set<Celular> celulares;
    @OneToMany
    @JoinColumn(name="operadora_id")
    private Set<Plano> planos;
}
