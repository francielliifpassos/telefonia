package ifsuldeminas.telefonia.controller.comercial;

import ifsuldeminas.telefonia.model.comercial.Plano;
import ifsuldeminas.telefonia.model.service.comercial.PlanoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plano")
public class PlanoController {
    private PlanoService planoService;

    //delegamos ao Spring a instanciacao do
    //objeto planoService
    public PlanoController(PlanoService planoService){
        this.planoService = planoService;
    }

    //operacao create
    @PostMapping
    public ResponseEntity create(@RequestBody @Valid Plano plano){
        //salvar os dados do plano no BD
        //chamar um servico de model que faça isso
        return new ResponseEntity(planoService.save(plano), HttpStatus.CREATED);
    }

    //operacoes read
    @GetMapping("/{id}")
    public ResponseEntity show(@PathVariable Long id){

        return new ResponseEntity(planoService.getById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity list(){
        return new ResponseEntity<>(planoService.list(), HttpStatus.OK);
    }

    //operacao update
    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody @Valid Plano plano){
        return new ResponseEntity(planoService.update(id, plano), HttpStatus.OK);
    }

    //operacao delete
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        planoService.delete(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
