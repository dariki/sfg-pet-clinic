package br.com.ariki.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import br.com.ariki.sfgpetclinic.model.PetType;
import br.com.ariki.sfgpetclinic.services.CrudService;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements CrudService<PetType, Long> {

	@Override
	public Set<PetType> findAll() {
		return super.findAll();
	}
	
	@Override
	public PetType findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public PetType save(PetType petType) {
		return super.save(petType);
	}
	
	@Override
	public void delete(PetType petType) {
		super.delete(petType);
	}
	
	@Override
	public void deleteById(Long id) {
		this.deleteById(id);
	}
	
}
