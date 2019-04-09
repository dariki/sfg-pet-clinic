package br.com.ariki.sfgpetclinic.services;

import java.util.Set;

import br.com.ariki.sfgpetclinic.model.Owner;

public interface OwnerService {

	Owner findByLastName(String lastName);
	
	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
}
