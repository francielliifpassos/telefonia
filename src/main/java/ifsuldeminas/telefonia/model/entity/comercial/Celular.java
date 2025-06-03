package ifsuldeminas.telefonia.model.entity.comercial;

import ifsuldeminas.telefonia.model.entity.pessoal.Cliente;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "class")
public class Celular {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long numero;
    @ManyToOne
    private Cliente cliente;
    @OneToMany
    @JoinColumn(name = "celular_id")
    private Set<Ligacao> ligacoes;
    @ManyToOne
    private Plano plano;
}
