package ifsuldeminas.telefonia.controller.comercial;

import ifsuldeminas.telefonia.exceptions.comercial.PlanoNotFoundException;
import ifsuldeminas.telefonia.model.entity.comercial.Plano;
import ifsuldeminas.telefonia.model.repositories.comercial.PlanoRepository;
import ifsuldeminas.telefonia.model.services.comercial.PlanoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/planos")
public class PlanoController {
    private PlanoService planoService;

    public PlanoController(PlanoService planoService){
        this.planoService = planoService;
    }

    @GetMapping
    public List<Plano> get(){
        return planoService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable Long id){
        try {
            Plano plano = planoService.getById(id);
            return new ResponseEntity(plano, HttpStatus.OK);
        } catch(PlanoNotFoundException pnfe){
            return new ResponseEntity(pnfe.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public Plano create(@RequestBody @Valid Plano plano){
        return planoService.create(plano);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody @Valid Plano plano){
        try {
            return new ResponseEntity<Plano>(planoService.update(id, plano), HttpStatus.OK);
        } catch(PlanoNotFoundException pnfe){
            return new ResponseEntity(pnfe.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Plano> delete(@PathVariable Long id){
        try {
            planoService.delete(id);
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        } catch(PlanoNotFoundException pnfe){
            return new ResponseEntity(pnfe.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
