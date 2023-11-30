package ifsuldeminas.bcc.telefonia.model.entity.pessoal;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;

import java.util.Set;

@Entity
@DiscriminatorValue(value="ClientePessoaFisica")
public class ClientePessoaFisica extends Cliente{

    @NotNull
    @NotBlank
    @Size(min=11, max=11)
    private String cpf;

    public ClientePessoaFisica(){
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
