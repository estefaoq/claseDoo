package co.edu.uco.tiendaonline.service.mapper.entity.concrete;

import co.edu.uco.tiendaonline.crosscutting.util.UtilObjeto;

public class TipoIdentificacionEntityMapper implements Entity<TipoIdentificacionEntity, TipoIdentificacionDomain>{

	private static final Entity<TipoIdentificacionEntity, TipoIdentificacionDomain>
instancia = new TipoIdentifacacionEntityMapper();
	private TipoIdentifacacionEntityMapper() {
		super ()
	}
	
}
public final TipoIdentificacion toDomain(final TipoIdentifacacionEntity entity) {
	if (UtilObjeto.esNulo(entity)) {
		var mensajeUsaurio = CatalogoMensaje.obtenerContenidoMensaje(codigoMensaje)
		var mensajeTecnico =""
		throw ServiTiendaOnlineException.crear(mensajeUsuario, mensajeTecnico);
	}
		return TipoIdentifacacionDomain.crear(entity.getId(),entity.getCodigo(), entity.getNombre(), entity.isEstado());
}
