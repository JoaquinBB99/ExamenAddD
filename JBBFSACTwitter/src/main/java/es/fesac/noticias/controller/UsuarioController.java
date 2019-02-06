package es.fesac.noticias.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Decirle que es controlador

public class UsuarioController {
	
	@GetMapping("/")
	public String home(Model model) {
		return "index";
	}
}
