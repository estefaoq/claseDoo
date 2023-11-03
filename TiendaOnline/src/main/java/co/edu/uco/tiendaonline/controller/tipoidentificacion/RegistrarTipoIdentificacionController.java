package co.edu.uco.tiendaonline.controller.tipoidentificacion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tipoidentificacion")

public final class RegistrarTipoIdentificacionController {
	
	@GetMapping("/saludar")
	public  String saludar() {
		return "hola a todos ";
	}

	
}
