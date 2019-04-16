package br.com.ariki.sfgpetclinic.web.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.ariki.sfgpetclinic.data.model.Owner;
import br.com.ariki.sfgpetclinic.data.model.PetType;
import br.com.ariki.sfgpetclinic.data.model.Vet;
import br.com.ariki.sfgpetclinic.data.services.OwnerService;
import br.com.ariki.sfgpetclinic.data.services.PetService;
import br.com.ariki.sfgpetclinic.data.services.PetTypeService;
import br.com.ariki.sfgpetclinic.data.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {
	
	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService =petTypeService;
	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner();
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		
		this.ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glennane");
		
		this.ownerService.save(owner2);
		
		System.out.println("Loaded Owners...");
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");
		
		this.vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");
		
		this.vetService.save(vet2);
		
		System.out.println("Loaded Vets...");
		
		PetType petType1 = new PetType();
		petType1.setName("Dog");
		
		this.petTypeService.save(petType1);
		
		PetType petType2 = new PetType();
		petType2.setName("Cat");
		
		this.petTypeService.save(petType2);
		
		System.out.println("Loaded PetTypes...");
		
	}

}
