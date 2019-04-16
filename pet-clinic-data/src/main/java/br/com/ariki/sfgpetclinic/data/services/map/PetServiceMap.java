package br.com.ariki.sfgpetclinic.data.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import br.com.ariki.sfgpetclinic.data.model.Pet;
import br.com.ariki.sfgpetclinic.data.services.PetService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}
	
	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Pet save(Pet pet) {
		return super.save(pet);
	}
	
	@Override
	public void delete(Pet object) {
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id) {
		this.deleteById(id);
	}
	
}
