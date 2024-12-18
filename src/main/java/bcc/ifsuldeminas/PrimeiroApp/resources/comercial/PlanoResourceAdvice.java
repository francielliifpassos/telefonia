package bcc.ifsuldeminas.PrimeiroApp.resources.comercial;

import bcc.ifsuldeminas.PrimeiroApp.exceptions.comercial.PlanoNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class PlanoResourceAdvice {
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(PlanoNotFoundException.class)
    public String planoNotFoundHandler(PlanoNotFoundException pnfe){
        return pnfe.getMessage();
    }
}
