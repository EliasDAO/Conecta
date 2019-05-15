package br.com.projeto.conecta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/")
	public String index(HttpSession session, HttpServletRequest request, ModelMap modelMap) {

		if (request.isUserInRole("ROLE_CLIENTE")) {
			return "redirect:/homeCliente";
		} else if (request.isUserInRole("ROLE_CONSULTOR")) {
			return "redirect:/homeConsultor";
		} else if (request.isUserInRole("ROLE_LIDER")) {
			return "redirect:/homeLider";
		}
		
		return "paginaDeErro";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

}
