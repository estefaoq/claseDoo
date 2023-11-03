package co.edu.uco.tiendaonline.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uco.tiendaonline.data.entity.TipoIdentificacion;

@RestController
@RequestMapping("/api/v1/tipoidentificacion")
public final class TipoIdentificacionControllerImpl<UUID> {
	
	
	
	}
	@GetMapping("/dummy")
	public final TipoIdentificacion ObtenerDummy( ) {
		Object TipoIdentificacionDTO;
		return TipoIdentificacionDTO.crear();
	}
	@PostMapping
	public String consultar( ) {
		return "hola a todos desde consultar";
	}
	@DeleteMapping
	public final  TipoIdentificacion consultar(@RequestHeader TipoIdentificacion dto ) {
		return dto;
	}
	@PostMapping
	public final UUID consultarPorId(@PathVariable ("id" UUID id ) {
		return id ;
	}
	
	@PostMapping
	public final  TipoIdentificacion registrar(@RequestBody TipoIdentificacionDTO dto ) {
		
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
