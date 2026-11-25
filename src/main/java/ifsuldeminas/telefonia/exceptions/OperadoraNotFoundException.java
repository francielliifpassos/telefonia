package ifsuldeminas.telefonia.exceptions;

public class OperadoraNotFoundException extends RuntimeException{
    public OperadoraNotFoundException(Long id){
        super("Operadora #" + id + " não encontrado!");
    }
}
