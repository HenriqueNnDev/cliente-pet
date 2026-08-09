package br.com.petz.cliente_pet.cliente.application.api;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import br.com.petz.cliente_pet.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {
    private final ClienteService clienteService;
    
	@Override
    public ClienteResponse postCliente(ClienteRequest clienteRequest) {
        log.info("[inicia] ClienteController - postCliente");
        ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
        log.info("[finaliza] ClienteController - postCliente");
        return clienteCriado;
    }

	@Override
	public List<ClienteListResponse> getTodosCliente() {
        log.info("[inicia] ClienteController - getTodosCliente");
        log.info("[finaliza] ClienteController - getTodosCliente");
		return null;
	}
}