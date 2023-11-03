package co.edu.uco.tiendaonline.service.domain.tipoidentificacion.rules;

import co.edu.uco.tiendaonline.crosscutting.exception.concrete.ServiceTiendaOnlineException;
import co.edu.uco.tiendaonline.crosscutting.util.UtilTexto;
import co.edu.uco.tiendaonline.service.domain.validationRule;

public final  class CodigoTipoIdentificacionValidationRules implements validationRule<string>{
	
}	
	public final void validar ( final String dato) {
		//1 tipo de dato
		
		//2 longitud 
	}
	private final void Validarlongitud( final String dato) {
		if (!UtilTexto.longitudMaximaValida(dato, 0, 50){
			var mensajeUsuario = "la longitud del codigo del tipo de identificacion no es valida debe estar 50 ";
			throw ServiceTiendaOnlineException.crear(mensajeUsuario);
		}
	}
	private final void ValidarObligatoriedad( final String dato) {
		if (UtilTexto.estaVacio(dato)) {
			var mensajeUsuario = "la longitud del codigo del tipo de identificacion no es valida debe estar 50 ";
			throw ServiceTiendaOnlineException.crear(mensajeUsuario);
		}
			
	}
private final void ValidarFormato( final String dato) {
	if (UtilTexto.contieneSoloLetras(dato)) {
		var mensajeUsuario = "la longitud del codigo del tipo de identificacion no es valida debe estar 50 ";
		throw ServiceTiendaOnlineException.crear(mensajeUsuario);
	}
