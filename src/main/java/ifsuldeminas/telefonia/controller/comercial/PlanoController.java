package ifsuldeminas.telefonia.controller.comercial;

import ifsuldeminas.telefonia.model.entity.comercial.Plano;
import ifsuldeminas.telefonia.model.repositories.comercial.PlanoRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/planos")
public class PlanoController {
    private PlanoRepository planoRepository;

    public PlanoController(PlanoRepository planoRepository){
        this.planoRepository = planoRepository;
    }

    @GetMapping
    public List<Plano> get(){
        return planoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Plano> get(@PathVariable Long id){
        Optional<Plano> opt = planoRepository.findById(id);
        if(!opt.isPresent()){
            return new ResponseEntity<Plano>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Plano>(opt.get(), HttpStatus.OK);
    }

    @PostMapping
    public Plano create(@RequestBody @Valid Plano plano){
        return planoRepository.save(plano);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Plano> update(@PathVariable Long id, @RequestBody @Valid Plano plano){
        Optional<Plano> opt = planoRepository.findById(id);
        if(!opt.isPresent()){
            return new ResponseEntity<Plano>(HttpStatus.NOT_FOUND);
        }
        Plano planoAux = opt.get();
        planoAux.setNome(plano.getNome());
        planoAux.setValorPorMinuto(plano.getValorPorMinuto());
        return new ResponseEntity<Plano>(planoRepository.save(planoAux), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Plano> delete(@PathVariable Long id){
        if(!planoRepository.existsById(id)){
            return new ResponseEntity<Plano>(HttpStatus.NOT_FOUND);
        }
        planoRepository.deleteById(id);
        return new ResponseEntity<Plano>(HttpStatus.NO_CONTENT);
    }
}
