package bcc.ifsuldeminas.PrimeiroApp.model.services.comercial;

import bcc.ifsuldeminas.PrimeiroApp.exceptions.comercial.PlanoNotFoundException;
import bcc.ifsuldeminas.PrimeiroApp.model.entities.telefonia.comercial.Plano;
import bcc.ifsuldeminas.PrimeiroApp.model.repositories.comercial.PlanoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanoService {
    PlanoRepository planoRepository;

    public PlanoService(PlanoRepository planoRepository){
        this.planoRepository = planoRepository;
    }

    public Plano create(Plano plano){
        this.planoRepository.save(plano);
        return plano;
    }

    public Plano read(Long id) throws PlanoNotFoundException {
        Optional opt = this.planoRepository.findById(id);
        if(!opt.isPresent()){
            throw new PlanoNotFoundException(id);
        }
        return (Plano)opt.get();
    }

    public List<Plano> read(){
        return this.planoRepository.findAll();
    }

    public Plano update(Long id, Plano plano) throws PlanoNotFoundException{
        Plano planoOriginal = read(id);
        planoOriginal.setNome(plano.getNome());
        planoOriginal.setValorPorMinuto(plano.getValorPorMinuto());
        this.planoRepository.save(planoOriginal);
        return planoOriginal;
    }

    public void delete(Long id) throws PlanoNotFoundException{
        if(!this.planoRepository.existsById(id)){
            throw new PlanoNotFoundException(id);
        }
        this.planoRepository.deleteById(id);
    }
}
