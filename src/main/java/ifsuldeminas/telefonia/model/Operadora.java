package ifsuldeminas.telefonia.model;

import ifsuldeminas.telefonia.model.comercial.Celular;
import ifsuldeminas.telefonia.model.comercial.Plano;
import ifsuldeminas.telefonia.model.pessoal.Cliente;

import java.util.List;

public class Operadora {
    private String nome;
    private List<Cliente> clientes;
    private List<Celular> celulares;
    private List<Plano> planos;
}
