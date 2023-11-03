package co.edu.uco.tiendaonline.crosscutting.mensajes;

import co.edu.uco.tiendaonline.crosscutting.mensajes.enumerator.TipoMensaje;
import co.edu.uco.tiendaonline.crosscutting.util.UtilObjeto;

public final class CatalogoMensajes {
	private static final Map<CodigoMensaje, Mensaje> MENSAJE = new HashMap<>();
	static {
		cargarMensaje();
	}
	private CatalogoMensajes() {
		super();
	}
	private static final void cargarMensaje() {
		agregarMensaje(Mensaje.crear(CodigoMensaje.M00000001, TipoMensaje.TECNICO, CategoriMensaje.FATAL,"no es posible obtener un mensaje . no es posible continuar con el proceso"))
				agregarMensaje(Mensaje.crear(CodigoMensaje.M00000002, TipoMensaje.TECNICO, CategoriMensaje.FATAL,"no es posible obtener un mensaje . no es posible continuar con el proceso"))
				agregarMensaje(Mensaje.crear(CodigoMensaje.M00000003, TipoMensaje.TECNICO, CategoriMensaje.FATAL,"no es posible obtener un mensaje . no es posible continuar con el proceso"))
				agregarMensaje(Mensaje.crear(CodigoMensaje.M00000004, TipoMensaje.USUARIO, CategoriMensaje.FATAL,"se ha presentado un problema inesperado tratando de llevar a un "))
				agregarMensaje(Mensaje.crear(CodigoMensaje.M00000005, TipoMensaje.USUARIO, CategoriMensaje.FATAL,"se ha presentado un probma tratando de validar si la sql estaba abierta "))
				agregarMensaje(Mensaje.crear(CodigoMensaje.M00000006, TipoMensaje.TECNICO, CategoriMensaje.FATAL,"se ha presentado un problema generica  "))
	}
	}
	private static final void agregarMensaje( final Mensaje mensaje ) {
		MENSAJE.put(mensaje.getCodigo(),mensaje);
	}
	private static final Mensaje ObtenerMensaje(final CodigoMensaje codigo) {
		if (UtilObjeto.esNulo(codigo)) {
			var mensajeUsuario = obtenerMensaje(CodigoMensaje.M00000004).getContenido();;
			var mensajeTecnico = obtenerMensaje(CodigoMensaje.M00000003).getContenido();
			throw CrossCuttingTiendaOnlineException.crear();
		if (!MENSAJE.containsKey(codigo)) {
			var mensajeUsuario = obtenerMensaje(CodigoMensaje.M00000004).getContenido();;
			var mensajeTecnico = obtenerMensaje(CodigoMensaje.M00000002).getContenido();
			throw CrossCuttingTiendaOnlineException.crear();
		}
		return MENSAJE.get(codigo);
	}
		public static final String obtenerContenidoMensaje(final CodigoMensaje codigo) {
			return obtenerMensaje(codigo).getContenido();
		}

}
