package ifsuldeminas.telefonia.model.service;

import ifsuldeminas.telefonia.exceptions.OperadoraNotFoundException;
import ifsuldeminas.telefonia.model.Operadora;
import ifsuldeminas.telefonia.model.repository.OperadoraRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OperadoraService {
    OperadoraRepository operadoraRepository;

    public OperadoraService(OperadoraRepository operadoraRepository){
        this.operadoraRepository = operadoraRepository;
    }

    public Operadora getById(Long id){
        Optional opt = operadoraRepository.findById(id);
        if(!opt.isPresent()){
            throw new OperadoraNotFoundException(id);
        }
        return (Operadora) opt.get();
    }
}
