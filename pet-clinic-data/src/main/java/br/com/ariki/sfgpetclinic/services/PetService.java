package br.com.ariki.sfgpetclinic.services;

import java.util.Set;

import br.com.ariki.sfgpetclinic.model.Pet;

public interface PetService {
	
	Pet findById(Long id);

	Pet save(Pet pet);

	Set<Pet> findAll();
}
