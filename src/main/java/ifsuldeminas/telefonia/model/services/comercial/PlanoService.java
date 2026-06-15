package ifsuldeminas.telefonia.model.services.comercial;

import ifsuldeminas.telefonia.model.entity.comercial.Plano;
import ifsuldeminas.telefonia.model.repositories.comercial.PlanoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanoService {
    private PlanoRepository planoRepository;

    public PlanoService(PlanoRepository planoRepository){
        this.planoRepository = planoRepository;
    }

    public List<Plano> getAll(){
        return planoRepository.findAll();
    }

    public Plano getById(Long id){
        Optional<Plano> opt = planoRepository.findById(id);
        if(!opt.isPresent()){
            return null;
        }
        return opt.get();
    }

    public Plano create(Plano plano){
        return planoRepository.save(plano);
    }

    public Plano update(Long id, Plano plano){
        Plano planoAux = getById(id);
        if(planoAux == null){
            return null;
        }
        planoAux.setNome(plano.getNome());
        planoAux.setValorPorMinuto(plano.getValorPorMinuto());
        return planoRepository.save(planoAux);
    }

    public void delete(Plano plano){
        planoRepository.delete(plano);
    }
}
