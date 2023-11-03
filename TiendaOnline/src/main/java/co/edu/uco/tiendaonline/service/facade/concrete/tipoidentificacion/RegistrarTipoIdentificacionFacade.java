package co.edu.uco.tiendaonline.service.facade.concrete.tipoidentificacion;


import co.edu.uco.tiendaonline.crosscutting.exception.concrete.ServiceTiendaOnlineException;
import co.edu.uco.tiendaonline.service.businesslogic.croncre.tipoidentificacion.RegistrarTipoIdentificacionUseCase;
import co.edu.uco.tiendaonline.service.businesslogic.croncre.tipoidentificacion.RegistrarTipoIdentificaconValidator;
import co.edu.uco.tiendaonline.service.dto.TipoIdentificacionDomain;
import co.edu.uco.tiendaonline.service.facade.Facade;

public class RegistrarTipoIdentificacionFacade implements Facade <TipoIdentificacionDTO>{
	public final void excute (final TipoIdentificacionDto dto {
		final TipoIdentificacionDomain = null; 
		RegistrarTipoIdentificaconValidator.ejecutar(domain);
		try {
			daoFactory.iniciarTransaccion();
			var useCase = new RegistrarTipoIdentificacionUseCase(daoFactory);
			dapFactory.confirmarTransaccion();
		}catch(final TiendaOnlineException exception);
		daoFactory.cancelarTransaccion();
		throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			var mensajeUsario = "";
			var mensajeTecnico = ""; 
			throw ServiceTiendaOnlineException.crear(exception, mensajeUsuario, mensajeTecnico){
				
			}finally {
				
			}
		
	}

}
