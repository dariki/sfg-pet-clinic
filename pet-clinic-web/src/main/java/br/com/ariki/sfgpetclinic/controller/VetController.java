package br.com.ariki.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ariki.sfgpetclinic.services.OwnerService;
import br.com.ariki.sfgpetclinic.services.VetService;

@Controller
public class VetController {
	
	private final VetService vetService;
	
	public VetController(VetService vetService) {
		this.vetService = vetService;
	}

	@RequestMapping({"/vets","/vets/index","/vets/index.html"})
	public String listVets(Model model) {
		model.addAttribute("vets", vetService.findAll());
		return "vets/index";
	}
}
