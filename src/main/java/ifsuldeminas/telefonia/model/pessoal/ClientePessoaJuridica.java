package ifsuldeminas.telefonia.model.pessoal;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "ClientePessoaJuridica")
public class ClientePessoaJuridica extends Cliente {
    private long cnpj;
}
