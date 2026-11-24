package ifsuldeminas.telefonia.exceptions.comercial;

public class PlanoNotFoundException extends RuntimeException{
    public PlanoNotFoundException(Long id){
        super("Plano #" + id + " não encontrado!");
    }
}
