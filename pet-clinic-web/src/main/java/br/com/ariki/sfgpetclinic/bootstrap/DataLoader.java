package br.com.ariki.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.ariki.sfgpetclinic.model.Owner;
import br.com.ariki.sfgpetclinic.model.Vet;
import br.com.ariki.sfgpetclinic.services.OwnerService;
import br.com.ariki.sfgpetclinic.services.VetService;
import br.com.ariki.sfgpetclinic.services.map.OwnerServiceMap;
import br.com.ariki.sfgpetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {
	
	private final OwnerService ownerService;
	private final VetService vetService;
	

	public DataLoader() {
		this.ownerService = new OwnerServiceMap();
		this.vetService = new VetServiceMap();
	}
	
	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		
		this.ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glennane");
		
		this.ownerService.save(owner2);
		
		System.out.println("Loaded Owners...");
		
		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");
		
		this.vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setId(2L);
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");
		
		this.vetService.save(vet2);
		
		System.out.println("Loaded Vets...");
		
		
	}

}
