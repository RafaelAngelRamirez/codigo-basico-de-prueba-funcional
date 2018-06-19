package com.dinamic.webPage.webPage.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MiPrimerController {
	
	//LA URL QUE CAPTURARA Y EL TIPO DE ENVIO EN GET. 
	// TAMBIEN PUEDE SER POST. 
	@GetMapping("/dobleExito")
	public String exitoTotal(Map<String, Object> model) {
		
		//AGREGA OBJECTOS PARA UTLIZARLOS CON THYMELEAF
		// EN LA VISTA. 
		model.put("mensaje", "El inicio fue todo un exito");
		
		//RETORNA EL NOMBRE DE LA VISTA DEFINIDA EN LA CARPETA
		//TEMPLATE.
		return "exitoTotal";
	}

}
