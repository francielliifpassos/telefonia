package ifsuldeminas.telefonia.model.service.comercial;

import ifsuldeminas.telefonia.exceptions.comercial.PlanoNotFoundException;
import ifsuldeminas.telefonia.model.comercial.Plano;
import ifsuldeminas.telefonia.model.repository.comercial.PlanoRepository;
import ifsuldeminas.telefonia.model.service.OperadoraService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanoService {
    private PlanoRepository planoRepository;
    private OperadoraService operadoraService;

    //delegando ao Spring a instanciacao do objeto
    public PlanoService(PlanoRepository planoRepository,
                        OperadoraService operadoraService){
        this.planoRepository = planoRepository;
        this.operadoraService = operadoraService;
    }

    //cadastra um Plano
    public Plano save(Plano plano){
        plano.setOperadora(operadoraService.getById(plano.getOperadora().getId()));
        //salva o plano no BD
        return planoRepository.save(plano);
    }

    public Plano getById(Long id){
        Optional opt = planoRepository.findById(id);
        if(!opt.isPresent()){
            //se nao retornou um plano
            throw new PlanoNotFoundException(id);
        }
        return (Plano)opt.get();
    }

    public List<Plano> list(){
        //retorna todos os planos cadastrados
        return planoRepository.findAll();
    }

    public Plano update(Long id, Plano plano){
        Plano planoAux = getById(id);
        planoAux.setNome(plano.getNome());
        planoAux.setValorPorMinuto(plano.getValorPorMinuto());
        return planoRepository.save(planoAux);
    }

    public void delete(Long id){
        if(!planoRepository.existsById(id)){
            throw new PlanoNotFoundException(id);
        }
        planoRepository.deleteById(id);
    }
}
