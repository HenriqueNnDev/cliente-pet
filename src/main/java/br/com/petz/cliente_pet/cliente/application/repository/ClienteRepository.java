package br.com.petz.cliente_pet.cliente.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.petz.cliente_pet.cliente.application.api.ClienteListResponse;
import br.com.petz.cliente_pet.cliente.domain.Cliente;
import lombok.Value;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
	Cliente buscaTodosClientes(UUID idCliente);
	Cliente buscaClienteAtravesId(UUID idCliente);
}