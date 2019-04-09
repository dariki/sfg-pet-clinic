package br.com.ariki.sfgpetclinic.services;

import java.util.Set;

import br.com.ariki.sfgpetclinic.model.Vet;

public interface VetService {

	Vet findById(Long id);

	Vet save(Vet vet);

	Set<Vet> findAll();
}
