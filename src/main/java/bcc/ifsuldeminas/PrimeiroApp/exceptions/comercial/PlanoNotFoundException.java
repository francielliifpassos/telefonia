package bcc.ifsuldeminas.PrimeiroApp.exceptions.comercial;

public class PlanoNotFoundException extends RuntimeException{
    public PlanoNotFoundException(Long id){
        super("Plano id " + id + " não encontrado!");
    }
}
