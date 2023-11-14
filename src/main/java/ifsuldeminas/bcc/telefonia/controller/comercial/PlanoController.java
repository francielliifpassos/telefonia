package ifsuldeminas.bcc.telefonia.controller.comercial;

import ifsuldeminas.bcc.telefonia.model.entity.comercial.Plano;
import ifsuldeminas.bcc.telefonia.model.repositories.comercial.PlanoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planos")
public class PlanoController {
    private PlanoRepository planoRepository;

    public PlanoController(PlanoRepository planoRepository){
        this.planoRepository = planoRepository;
    }

    @GetMapping
    public List<Plano> list(){
        return planoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Plano show(@PathVariable Long id){
        return planoRepository.getById(id);
    }

    @PostMapping
    public Plano save(@RequestBody Plano plano){
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
