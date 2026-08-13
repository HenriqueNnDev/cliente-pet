package br.com.petz.cliente_pet.pet.infra;

import org.springframework.stereotype.Repository;

import br.com.petz.cliente_pet.pet.application.service.PetRepository;
import br.com.petz.cliente_pet.pet.domain.Pet;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PetInfraRepository implements PetRepository {
    private final PetSpringDataJPARepository petSpringDataJPARepository;
	
	@Override
	public Pet salvaPet(Pet pet) {
		log.info("[start] PetInfraRepository - salva pet");
		petSpringDataJPARepository.save(pet);
		log.info("[finaliza] PetInfraRepository - salva pet");
		return pet;
	}

}
