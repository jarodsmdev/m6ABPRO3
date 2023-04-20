package com.JarodSmith.spring.mvc.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactoController {

	@RequestMapping("/contact")
	public String ContactPage() {
		return "contacto";
	}
}
