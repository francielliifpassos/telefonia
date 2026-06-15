package ifsuldeminas.telefonia.controller.comercial;

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
    public ResponseEntity<Plano> get(@PathVariable Long id){
        Plano plano = planoService.getById(id);
        if(plano == null){
            return new ResponseEntity<Plano>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Plano>(plano, HttpStatus.OK);
    }

    @PostMapping
    public Plano create(@RequestBody @Valid Plano plano){
        return planoService.create(plano);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Plano> update(@PathVariable Long id, @RequestBody @Valid Plano plano){
        Plano planoAux = planoService.update(id, plano);
        if(planoAux == null){
            return new ResponseEntity<Plano>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Plano>(planoAux, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Plano> delete(@PathVariable Long id){
        Plano plano = planoService.getById(id);
        if(plano == null){
            return new ResponseEntity<Plano>(HttpStatus.NOT_FOUND);
        }
        planoService.delete(plano);
        return new ResponseEntity<Plano>(HttpStatus.NO_CONTENT);
    }
}
