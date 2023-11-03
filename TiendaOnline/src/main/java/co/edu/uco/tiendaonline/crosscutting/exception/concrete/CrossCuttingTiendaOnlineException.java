package co.edu.uco.tiendaonline.crosscutting.exception.concrete;

import co.edu.uco.tiendaonline.crosscutting.exception.TiendaOnlineException;
import co.edu.uco.tiendaonline.crosscutting.exception.enumerator.LugarException;

public class CrossCuttingTiendaOnlineException extends TiendaOnlineException{
	

		private static final long serialVersionUID = 6744095626690529725L;
		
		protected CrosscuttingTiendaOnlineException(final Throwable excepcionRaiz, final String mensajeUsuario,
				final String mensajeTecnico) {
			super(LugarException.CROSSCUTTING, excepcionRaiz, mensajeUsuario, mensajeTecnico);
		}
		
		public static final TiendaOnlineException crear(final String mensajeUsuario) {
			return new CrosscuttingTiendaOnlineException(null, mensajeUsuario, mensajeUsuario);
		}
		
		public static final TiendaOnlineException crear (final String mensajeUsuario, final String mensajeTecnico) {
			return new CrosscuttingTiendaOnlineException(null, mensajeUsuario, mensajeTecnico);
		}
		
		public static final TiendaOnlineException crear (final Throwable excepcionRaiz, final String mensajeUsuario, final String mensajeTecnico) {
			return new CrosscuttingTiendaOnlineException(excepcionRaiz, mensajeUsuario, mensajeTecnico);
		}

	}