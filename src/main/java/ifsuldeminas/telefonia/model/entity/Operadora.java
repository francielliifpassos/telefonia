package ifsuldeminas.telefonia.model.entity;

import ifsuldeminas.telefonia.model.entity.comercial.Celular;
import ifsuldeminas.telefonia.model.entity.comercial.Plano;
import ifsuldeminas.telefonia.model.entity.pessoal.Cliente;

import java.util.Set;

public class Operadora {
    private String nome;
    private Set<Cliente> clientes;
    private Set<Plano> planos;
    private Set<Celular> celulares;
}
