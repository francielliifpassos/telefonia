package ifsuldeminas.bcc.telefonia.controller.pessoal;

import ifsuldeminas.bcc.telefonia.model.entity.pessoal.ClientePessoaFisica;
import ifsuldeminas.bcc.telefonia.services.pessoal.ClientePessoaFisicaService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientespf")
public class ClientePessoaFisicaController {
    private ClientePessoaFisicaService clientePessoaFisicaService;

    public ClientePessoaFisicaController(ClientePessoaFisicaService clientePessoaFisicaService){
        this.clientePessoaFisicaService = clientePessoaFisicaService;
    }

    @PostMapping
    public ClientePessoaFisica save(@Valid @RequestBody ClientePessoaFisica clientePessoaFisica){
        System.out.println("Testando.............");
        return this.clientePessoaFisicaService.save(clientePessoaFisica);
    }
}
