package ifsuldeminas.telefonia.model.comercial;

import ifsuldeminas.telefonia.model.Operadora;
import ifsuldeminas.telefonia.model.pessoal.Cliente;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="class")
public class Celular {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long numero;
    @ManyToOne
    private Operadora operadora;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Plano plano;
    @OneToMany(mappedBy = "origem")
    private List<Ligacao> feitas;
    @OneToMany(mappedBy = "destino")
    private List<Ligacao> recebidas;
}
