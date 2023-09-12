package ifsuldeminas.bcc.telefonia.model.entity.comercial;

import ifsuldeminas.bcc.telefonia.model.entity.pessoal.Cliente;

import java.util.Set;

public class Celular {
    private long numero;
    Cliente cliente;
    Plano plano;
    Set<Ligacao> ligacoes;
}
