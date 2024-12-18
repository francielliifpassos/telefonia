package bcc.ifsuldeminas.PrimeiroApp.controller.comercial;

import bcc.ifsuldeminas.PrimeiroApp.model.entities.telefonia.comercial.Plano;
import bcc.ifsuldeminas.PrimeiroApp.model.services.comercial.PlanoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/plano")
public class PlanoController {
    private PlanoService planoService;

    public PlanoController(PlanoService planoService){
        this.planoService = planoService;
    }

    @PostMapping
    public ResponseEntity create(@RequestBody Plano plano){
        this.planoService.create(plano);
        return new ResponseEntity(plano, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity read(@PathVariable Long id){
        Plano plano = this.planoService.read(id);
        return new ResponseEntity(plano, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity read(){
        return new ResponseEntity(this.planoService.read(),
                HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody Plano plano){
        Plano planoOriginal = this.planoService.update(id, plano);
        return new ResponseEntity(planoOriginal, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        this.planoService.delete(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
