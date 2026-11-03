package ifsuldeminas.telefonia.model.pessoal;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="ClientePessoaFisica")
public class ClientePessoaFisica extends Cliente {
    private long cpf;
}
