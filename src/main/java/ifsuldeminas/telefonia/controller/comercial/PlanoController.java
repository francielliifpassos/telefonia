package ifsuldeminas.telefonia.controller.comercial;

import ifsuldeminas.telefonia.model.entity.comercial.Plano;
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
         return new ResponseEntity<Plano>(planoService.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public Plano create(@RequestBody @Valid Plano plano){
        return planoService.create(plano);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Plano> update(@PathVariable Long id, @RequestBody @Valid Plano plano){
        return new ResponseEntity<Plano>(planoService.update(id, plano), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        planoService.delete(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
