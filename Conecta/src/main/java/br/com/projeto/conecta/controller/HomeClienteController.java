package br.com.projeto.conecta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.projeto.conecta.security.ConectaUserDetailsService;
import br.com.projeto.conecta.service.DisponivelService;

@Controller
public class HomeClienteController {

	@Autowired
	private DisponivelService disponivelService;
	@Autowired
	private ConectaUserDetailsService conecta;
	
	@GetMapping("/homeCliente")
	public String listarDisponiveis(ModelMap model) {
		model.addAttribute("disponiveis",disponivelService.buscarTodos());
		
		Integer userId = conecta.getCurrentUserId();
		System.out.println(userId);
		
		return "homeCliente";
	}
	
}