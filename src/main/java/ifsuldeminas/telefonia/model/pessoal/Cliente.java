package ifsuldeminas.telefonia.model.pessoal;

import ifsuldeminas.telefonia.model.Operadora;
import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "class")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    @ManyToOne
    private Operadora operadora;
}
