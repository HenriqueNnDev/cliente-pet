package br.com.petz.cliente_pet.pet.application.service;

import java.util.List;
import java.util.UUID;

import br.com.petz.cliente_pet.pet.application.api.PetAlteracaoRequest;
import br.com.petz.cliente_pet.pet.application.api.PetClienteDetalhadoResponse;
import br.com.petz.cliente_pet.pet.application.api.PetClienteListResponse;
import br.com.petz.cliente_pet.pet.application.api.PetRequest;
import br.com.petz.cliente_pet.pet.application.api.PetResponse;
import jakarta.validation.Valid;

public interface PetService{
	PetResponse criaPet(UUID idCliente, @Valid PetRequest petRequest);
	List<PetClienteListResponse> buscaPetsDoClienteComID(UUID idCliente);
	PetClienteDetalhadoResponse buscaPetsDoClienteComID(UUID idCliente, UUID idPet);
	void deletaPetDoClienteComID(UUID idCliente, UUID idPet);
	void alteraPetDoClienteComID(UUID idCliente, UUID idPet, PetAlteracaoRequest alteracaoRequest);
	
}
