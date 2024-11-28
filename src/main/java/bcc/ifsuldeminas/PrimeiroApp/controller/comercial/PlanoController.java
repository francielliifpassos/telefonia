package bcc.ifsuldeminas.PrimeiroApp.controller.comercial;

import bcc.ifsuldeminas.PrimeiroApp.model.entities.telefonia.comercial.Plano;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/plano")
public class PlanoController {
    @PostMapping
    public Plano create(){
        return new Plano();
    }

    @GetMapping("/{id}")
    public Plano read(@PathVariable Long id){
        return new Plano();
    }

    @GetMapping
    public Set<Plano> read(){
        return new HashSet<>();
    }

    @PutMapping("/{id}")
    public Plano update(@PathVariable Long id){
        return new Plano();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){

    }
}
