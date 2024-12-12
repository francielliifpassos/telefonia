package bcc.ifsuldeminas.PrimeiroApp.controller.comercial;

import bcc.ifsuldeminas.PrimeiroApp.exceptions.comercial.PlanoNotFoundException;
import bcc.ifsuldeminas.PrimeiroApp.model.entities.telefonia.comercial.Plano;
import bcc.ifsuldeminas.PrimeiroApp.model.repositories.comercial.PlanoRepository;
import bcc.ifsuldeminas.PrimeiroApp.model.services.comercial.PlanoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

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
        try{
            Plano plano = this.planoService.read(id);
            return new ResponseEntity(plano, HttpStatus.OK);
        }catch (PlanoNotFoundException pnfe){
            return new ResponseEntity(pnfe.getMessage(),
                    HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity read(){
        return new ResponseEntity(this.planoService.read(),
                HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody Plano plano){
        try{
            Plano planoOriginal = this.planoService.update(id, plano);
            return new ResponseEntity(planoOriginal, HttpStatus.OK);
        }catch (PlanoNotFoundException pnfe){
            return new ResponseEntity(pnfe.getMessage(),
                    HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        try{
            this.planoService.delete(id);
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }catch (PlanoNotFoundException pnfe){
            return new ResponseEntity(pnfe.getMessage(),
                    HttpStatus.NOT_FOUND);
        }
    }
}
