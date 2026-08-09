package br.com.petz.cliente_pet.cliente.application.repository;

import br.com.petz.cliente_pet.cliente.domain.Cliente;
import lombok.Value;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
}