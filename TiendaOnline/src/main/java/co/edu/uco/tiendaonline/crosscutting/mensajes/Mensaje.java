package co.edu.uco.tiendaonline.crosscutting.mensajes;

import co.edu.uco.tiendaonline.crosscutting.util.UtilObjeto;

public final  class Mensaje {
	private CodigoMensaje codigo;
	private TipoMensaje tipo;
	private CategoriMensaje categoria;
	private String contenido; 
	
	private mensaje (final CodigoMensaje codigo, final TipoMensaje tipo , final CategoriMensaje categoria, final String contenido ) {
		setCodigo(codigo);
		setTipo(tipo);
		setCategoria(categoria);
		setContenido(contenido);
		
	}
	public static final Mensaje crear (final CodigoMensaje codigo, final TipoMensaje tipo , final CategoriaMensaje categoria, final String contenido) {
		return new mensaje (codigo, tipo, categoria, contenido);
	}
	 private final void setCodigo(final CodigoMensaje codigo) {
		 if (UtilObjeto.esNulo(codigo)) {
				var mensajeUsuario = CatalogoMensaje(CodigoMensaje.M00000004).getContenido();;
				var mensajeTecnico = CatalogoMensaje(CodigoMensaje.M00000001).getContenido();
				throw CrossCuttingTiendaOnlineException.crear(mensajeUsuario, mensaje);
		this.codigo = codigo;
	}
	
}

