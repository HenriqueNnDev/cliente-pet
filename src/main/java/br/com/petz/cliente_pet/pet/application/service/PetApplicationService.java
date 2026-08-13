package br.com.petz.cliente_pet.pet.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.petz.cliente_pet.cliente.application.service.ClienteService;
import br.com.petz.cliente_pet.pet.application.api.PetAlteracaoRequest;
import br.com.petz.cliente_pet.pet.application.api.PetClienteDetalhadoResponse;
import br.com.petz.cliente_pet.pet.application.api.PetClienteListResponse;
import br.com.petz.cliente_pet.pet.application.api.PetRequest;
import br.com.petz.cliente_pet.pet.application.api.PetResponse;
import br.com.petz.cliente_pet.pet.domain.Pet;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class PetApplicationService implements PetService {
	private final ClienteService clienteService;
	private final PetRepository petRepository;
	@Override
	public PetResponse criaPet(UUID idCliente, @Valid PetRequest petRequest) {
		log.info("[start] PetApplicationService - CriaPet");
		clienteService.buscarClienteAtravesId(idCliente);
		Pet pet = petRepository.salvaPet(new Pet(idCliente, petRequest));
		log.info("[finish] PetApplicationService - CriaPet");
		return new PetResponse(pet.getIdPet());
	}
	@Override
	public List<PetClienteListResponse> buscaPetsDoClienteComID(UUID idCliente) {
		log.info("[start] PetApplicationService - buscaPetsDoClienteComID");
		clienteService.buscarClienteAtravesId(idCliente);
		List<Pet> petsDoCliente = petRepository.buscaPetsDoClienteComID(idCliente);
		log.info("[finish] PetApplicationService - buscaPetsDoClienteComID");

		return PetClienteListResponse.converte(petsDoCliente);
	}
	@Override
	public PetClienteDetalhadoResponse buscaPetsDoClienteComID(UUID idCliente, UUID idPet) {
		log.info("[start] PetApplicationService - buscaPetsDoClienteComID");
		clienteService.buscarClienteAtravesId(idCliente);
		Pet pet= petRepository.buscaPetPeloId(idPet);
		log.info("[finish] PetApplicationService - buscaPetsDoClienteComID");
		return new PetClienteDetalhadoResponse(pet);

	}
	@Override
	public void deletaPetDoClienteComID(UUID idCliente, UUID idPet) {
		log.info("[start] PetApplicationService - deletaPetDoClienteComID");
		clienteService.buscarClienteAtravesId(idCliente);
		Pet pet= petRepository.buscaPetPeloId(idPet);
		petRepository.deletaPet(pet); 
		log.info("[start] PetApplicationService - deletaPetDoClienteComID");
	}
	@Override
	public void alteraPetDoClienteComID(UUID idCliente, UUID idPet, PetAlteracaoRequest petAlteracaoRequest) {
		log.info("[start] PetApplicationService - alteraPetDoClienteComID");
		clienteService.buscarClienteAtravesId(idCliente);
		Pet pet= petRepository.buscaPetPeloId(idPet);
		pet.altera(petAlteracaoRequest);
		petRepository.salvaPet(pet);
		log.info("[finaliza] PetApplicationService - alteraPetDoClienteComID");
	}
}