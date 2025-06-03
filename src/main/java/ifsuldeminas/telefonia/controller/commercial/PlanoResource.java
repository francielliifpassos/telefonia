package ifsuldeminas.telefonia.controller.commercial;

import ifsuldeminas.telefonia.model.entity.comercial.Plano;
import ifsuldeminas.telefonia.model.repositories.commercial.PlanoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plano")
public class PlanoResource {
    private PlanoRepository planoRepository;

    public PlanoResource(PlanoRepository planoRepository){
        this.planoRepository = planoRepository;
    }

    @GetMapping
    public List<Plano> get(){
        return planoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Plano get(@PathVariable Long id){
        return planoRepository.getById(id);
    }

    @PostMapping
    public Plano create(@RequestBody Plano plano){
        return planoRepository.save(plano);
    }

    @PutMapping("/{id}")
    public Plano update(@PathVariable Long id, @RequestBody Plano plano){
        Plano planoAux = planoRepository.getById(id);
        planoAux.setNome(plano.getNome());
        planoAux.setValorPorMinuto(plano.getValorPorMinuto());
        return planoRepository.save(planoAux);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        planoRepository.deleteById(id);
    }
}
