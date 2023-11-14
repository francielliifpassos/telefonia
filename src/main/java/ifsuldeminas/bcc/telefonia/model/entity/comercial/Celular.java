package ifsuldeminas.bcc.telefonia.model.entity.comercial;

import ifsuldeminas.bcc.telefonia.model.entity.pessoal.Cliente;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="classe")
public class Celular {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long numero;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Plano plano;
    @OneToMany
    @JoinColumn(name="celular_id")
    private Set<Ligacao> ligacoes;
}
