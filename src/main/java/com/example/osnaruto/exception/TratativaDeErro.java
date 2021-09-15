package com.example.osnaruto.exception;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class TratativaDeErro extends ResponseEntityExceptionHandler {


    @ExceptionHandler(AutenticacaoException.class)
    protected ResponseEntity autenticacaoException(AutenticacaoException ex) {
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Token nao encontrado");
    }


    @ExceptionHandler(BasicException.class)
    protected ResponseEntity basicExveption(BasicException basic){
        String motivo = basic.getMotivo();
        return ResponseEntity.status(HttpStatus.PRECONDITION_FAILED).body(motivo);
    }

}
