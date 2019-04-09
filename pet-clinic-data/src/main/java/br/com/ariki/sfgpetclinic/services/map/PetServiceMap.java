package br.com.ariki.sfgpetclinic.services.map;

import java.util.Set;

import br.com.ariki.sfgpetclinic.model.Pet;
import br.com.ariki.sfgpetclinic.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

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
		return super.save(pet.getId(), pet);
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
