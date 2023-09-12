package ifsuldeminas.bcc.telefonia.model.entity;

import ifsuldeminas.bcc.telefonia.model.entity.comercial.Celular;
import ifsuldeminas.bcc.telefonia.model.entity.comercial.Plano;
import ifsuldeminas.bcc.telefonia.model.entity.pessoal.Cliente;

import java.util.Set;

public class Operadora {
    private String nome;
    Set<Cliente> clientes;
    Set<Celular> celulares;
    Set<Plano> planos;
}
