package co.edu.uco.tiendaonline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tipoidentificacion")
public final class TipoIdentificacionControllerImpl {
	
	
	
	}
	@GetMapping("/dummy")
	public final TipoIdentificacionDTO ObtenerDummy( ) {
		return TipoIdentificacionDTO.crear();
	}
	@PostMapping
	public String consultar( ) {
		return "hola a todos desde consultar";
	}
	@PostMapping
	public final  TipoIdentificacionDTO consultar(@RequestBody TipoIdentificacionDTO dto ) {
		return dto;
	}
	@PostMapping
	public final UUID consultarPorId(@PathVariable ("id" UUID id ) {
		return id ;
	}
	
	@PostMapping
	public final  TipoIdentificacionDTO registrar(@RequestBody TipoIdentificacionDTO dto ) {
		
		respuesta 
		return dto;
	}
	
	@PutMapping
	public final TipoIdentificacionDTO modificar(@RequestBody TipoIdentificacionDTO dto ) {
		return dto;
	}
	@DeleteMapping("/ {id}")
	public UUID eliminar( @PathVariable("id ") UUID id ) {
		return "hola a todos desde eliminar";
	}
	

	
	
	
}
