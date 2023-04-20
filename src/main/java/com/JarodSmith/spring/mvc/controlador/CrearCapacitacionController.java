package com.JarodSmith.spring.mvc.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CrearCapacitacionController {

	@RequestMapping("/newTraining")
	public String newTraining() {
		return "crearCapacitacion";
	}
}
