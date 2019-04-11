package br.com.ariki.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import br.com.ariki.sfgpetclinic.model.Owner;
import br.com.ariki.sfgpetclinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}
	
	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Owner save(Owner owner) {
		return super.save(owner);
	}
	
	@Override
	public void delete(Owner owner) {
		super.delete(owner);
	}
	
	@Override
	public void deleteById(Long id) {
		this.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		return null;
	}
	
}
