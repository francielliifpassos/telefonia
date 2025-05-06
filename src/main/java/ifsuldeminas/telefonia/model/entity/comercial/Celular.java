package ifsuldeminas.telefonia.model.entity.comercial;

import ifsuldeminas.telefonia.model.entity.pessoal.Cliente;

import java.util.Set;

public class Celular {
    private long numero;
    private Cliente cliente;
    private Set<Ligacao> ligacoes;
    private Plano plano;
}
