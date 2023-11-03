package co.edu.uco.tiendaonline.crosscutting.exception.concrete;

public final class DataTiendaOnlineException extends TiendaOnlineException {
	private static final long serialVersionUID = -917748419412668569L;
	proceted DataTiendaOnlineException (final Throwable excepcionRaiz, final String mensajeUsuario, final String mansajeTcnico) {
		super (LugarException.CONTROLLER,excepcionRaiz,mensajeUsuario,mensajeTecnico);
	}
	public static final TiendaOnlineException crear (final String mensajeUsuario) {
		return new ControllerTiendaOnlineException( null , mensajeUsuario, mensajeUsuario);
	}
	public static final TiendaOnlineException crear (final Throwable excepcionRaiz, final String mensajeTecnico) {
		return new ControllerTiendaOnlineException( null , excepcionRaiz, mensajeTecnico);
	}
}