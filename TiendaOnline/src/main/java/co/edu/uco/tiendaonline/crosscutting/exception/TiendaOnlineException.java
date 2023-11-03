package co.edu.uco.tiendaonline.crosscutting.exception;

import co.edu.uco.tiendaonline.crosscutting.exception.enumerator.LugarException;
import co.edu.uco.tiendaonline.crosscutting.util.UtilObjeto;
import co.edu.uco.tiendaonline.crosscutting.util.UtilTexto;

public class TiendaOnlineException extends RuntimeException {

	private static final long serialVersionUID = -551425312694998396L;
	private LugarException lugar;
	private Throwable excepcionRaiz;
	private String mensajeUsuario;
	private String mensajeTecnico;
	private boolean tieneExcepcionRaiz;

	protected TiendaOnlineException(final LugarException lugar, final Throwable excepcionRaiz,
			final String mensajeUsuario, final String mensajeTecnico) {
		super(mensajeTecnico, excepcionRaiz);
		setLugar(lugar);
		setExcepcionRaiz(excepcionRaiz);
		setMensajeUsuario(mensajeUsuario);
		setMensajeTecnico(mensajeTecnico);
	}

	private final void setLugar(final LugarException lugar) {
		this.lugar = UtilObjeto.obtenerValorDefecto(lugar, LugarException.GENERAL);
	}

	private final void setExcepcionRaiz(final Throwable excepcionRaiz) {
		setTieneExcepcionRaiz(!UtilObjeto.esNulo(excepcionRaiz));
		this.excepcionRaiz = UtilObjeto.obtenerValorDefecto(excepcionRaiz, new Exception());
	}

	private final void setMensajeUsuario(final String mensajeUsuario) {
		this.mensajeUsuario = UtilTexto.aplicarTrim(mensajeUsuario);
	}

	private final void setMensajeTecnico(final String mensajeTecnico) {
		this.mensajeTecnico = UtilTexto.aplicarTrim(mensajeTecnico);
	}

	private final void setTieneExcepcionRaiz(final boolean tieneExcepcionRaiz) {
		this.tieneExcepcionRaiz = tieneExcepcionRaiz;
	}

	public final LugarException getLugar() {
		return lugar;
	}

	public final Throwable getExcepcionRaiz() {
		return excepcionRaiz;
	}

	public final String getMensajeUsuario() {
		return mensajeUsuario;
	}

	public final String getMensajeTecnico() {
		return mensajeTecnico;
	}

	public final boolean isTieneExcepcionRaiz() {
		return tieneExcepcionRaiz;
	}

}