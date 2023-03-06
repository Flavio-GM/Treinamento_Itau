package br.gama.itau.spring03.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandlerExeptions {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ExceptionDetails> handlerNotFoundException(NotFoundException ex) {
        ExceptionDetails exceptionDetails = ExceptionDetails.builder()
                .titulo("Erro na solicitação!")
                .mensagem(ex.getMessage())
                .codigoStatus(HttpStatus.NOT_FOUND.value())
                .timeStamp(LocalDateTime.now())
                .build();

        // Poderia usar esta opção de baixo.
        // exceptionDetails.setTitulo("Erro na solicitação!");
        // exceptionDetails.setMensagem(ex.getMessage());
        // exceptionDetails.setCodigoStatus(HttpStatus.NOT_FOUND.value());
        // exceptionDetails.setTimeStamp(LocalDateTime.now());

        return new ResponseEntity<>(exceptionDetails , HttpStatus.NOT_FOUND);
    }
}
