package br.com.ariki.sfgpetclinic.services;

import br.com.ariki.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	
	Owner findByLastName(String lastName);
}
