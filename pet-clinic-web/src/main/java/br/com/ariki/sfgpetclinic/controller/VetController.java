package br.com.ariki.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ariki.sfgpetclinic.services.OwnerService;

@Controller
public class VetController {
	
	@RequestMapping({"/vets","/vets/index","/vets/index.html"})
	public String listVets(Model model) {
		return "vets/index";
	}
}
