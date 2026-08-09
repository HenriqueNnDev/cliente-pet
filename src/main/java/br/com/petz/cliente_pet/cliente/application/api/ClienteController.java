package br.com.petz.cliente_pet.cliente.application.api;

import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ClienteController implements ClienteAPI {

    @Override
    public ClienteResponse postCliente(ClienteRequest clienteRequest) {
        log.info("[inicia] ClienteController - postCliente");
        log.info("[finaliza] ClienteController - postCliente");
        return null;
    }
}