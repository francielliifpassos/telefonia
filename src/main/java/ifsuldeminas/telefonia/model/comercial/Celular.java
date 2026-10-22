package ifsuldeminas.telefonia.model.comercial;

import ifsuldeminas.telefonia.model.Operadora;
import ifsuldeminas.telefonia.model.pessoal.Cliente;

import java.util.List;

public class Celular {
    private long numero;
    private Operadora operadora;
    private Cliente cliente;
    private Plano plano;
    private List<Ligacao> feitas;
    private List<Ligacao> recebidas;
}
