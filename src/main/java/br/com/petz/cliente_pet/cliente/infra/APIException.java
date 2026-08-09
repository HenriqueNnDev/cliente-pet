package br.com.petz.cliente_pet.cliente.infra;

import org.springframework.http.HttpStatus;
import lombok.Getter;

@Getter
public class APIException extends RuntimeException {
    
    private final HttpStatus status;

    private APIException(HttpStatus status, String mensagem) {
        super(mensagem);
        this.status = status;
    }

    public static APIException build(HttpStatus status, String mensagem) {
        return new APIException(status, mensagem);
    }
}