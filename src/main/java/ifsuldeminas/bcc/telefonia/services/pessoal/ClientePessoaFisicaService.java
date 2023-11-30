package ifsuldeminas.bcc.telefonia.services.pessoal;

import ifsuldeminas.bcc.telefonia.model.entity.pessoal.ClientePessoaFisica;
import ifsuldeminas.bcc.telefonia.model.repositories.pessoal.ClientePessoaFisicaRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientePessoaFisicaService {
    private ClientePessoaFisicaRepository clientePessoaFisicaRepository;

    public ClientePessoaFisicaService(ClientePessoaFisicaRepository clientePessoaFisicaRepository){
        this.clientePessoaFisicaRepository = clientePessoaFisicaRepository;
    }

    public ClientePessoaFisica save(ClientePessoaFisica clientePessoaFisica){
        return this.clientePessoaFisicaRepository.save(clientePessoaFisica);
    }
}
