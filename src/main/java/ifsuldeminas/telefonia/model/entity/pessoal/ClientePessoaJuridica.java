package ifsuldeminas.telefonia.model.entity.pessoal;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "ClientePessoaJuridica")
public class ClientePessoaJuridica extends Cliente{
    private String cnpj;
}
