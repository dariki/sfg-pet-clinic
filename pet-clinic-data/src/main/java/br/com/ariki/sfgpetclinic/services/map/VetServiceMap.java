package br.com.ariki.sfgpetclinic.services.map;

import java.util.Set;

import br.com.ariki.sfgpetclinic.model.Vet;
import br.com.ariki.sfgpetclinic.services.CrudService;
import br.com.ariki.sfgpetclinic.services.VetService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}
	
	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Vet save(Vet vet) {
		return super.save(vet.getId(), vet);
	}
	
	@Override
	public void delete(Vet vet) {
		super.delete(vet);
	}
	
	@Override
	public void deleteById(Long id) {
		this.deleteById(id);
	}
	
}
