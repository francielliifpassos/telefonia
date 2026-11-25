package ifsuldeminas.telefonia.resources;

import ifsuldeminas.telefonia.exceptions.OperadoraNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class OperadoraResourceAdvice {
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(OperadoraNotFoundException.class)
    public String operadoraNotFoundHandler(OperadoraNotFoundException onfe){
        return onfe.getMessage();
    }
}
