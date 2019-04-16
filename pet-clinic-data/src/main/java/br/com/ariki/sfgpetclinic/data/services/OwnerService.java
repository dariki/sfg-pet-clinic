package br.com.ariki.sfgpetclinic.data.services;

import br.com.ariki.sfgpetclinic.data.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	
	Owner findByLastName(String lastName);
}
