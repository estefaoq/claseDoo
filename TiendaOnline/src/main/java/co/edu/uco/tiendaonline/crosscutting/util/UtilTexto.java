package co.edu.uco.tiendaonline.crosscutting.util;

public final class UtilTexto {

	public static final String VACIO = "";
	public static final String PATTERN_SOLO_LETRAS= " [A-Z a-z]";
	public static final String PATTERN_SOLO_LETRAS_DIGITOS_ESPACIOS= " [0-9A-za]+$";

	private UtilTexto() {
		super();
	}

	public static final String obtenerValorDefecto(final String valor, final String valorDefecto) {
		return UtilObjeto.obtenerValorDefecto(valor, valorDefecto);
	}

	public static final String obtenerValorDefecto(final String valor) {
		return obtenerValorDefecto(valor, VACIO);
	}

	public static final String aplicarTrim(final String valor) {
		return obtenerValorDefecto(valor).trim();
	}

	public static final boolean igualSinTrim(final String valorUno, final String valorDos) {
		return obtenerValorDefecto(valorUno).equals(obtenerValorDefecto(valorDos));
	}

	public static final boolean igualConTrim(final String valorUno, final String valorDos) {
		return aplicarTrim(valorUno).equals(aplicarTrim(valorDos));
	}

	public static final boolean igualSinTrimIgnoreCase(final String valorUno, final String valorDos) {
		return obtenerValorDefecto(valorUno).equalsIgnoreCase(obtenerValorDefecto(valorDos));
	}

	public static final boolean igualConTrimIgnoreCase(final String valorUno, final String valorDos) {
		return aplicarTrim(valorUno).equalsIgnoreCase(aplicarTrim(valorDos));
		
	}
	
	

	public static final boolean longitudMaximaValida(final String valor, final int longitud ) {
		return aplicarTrim(valor).length() >= longitud;
	}	
	public static final boolean longitudMinimaValida(final String valor, final int longitud ) {
		return aplicarTrim(valor).length() >= longitud;
	}	
	public static final boolean longitudValida(final String valor, final int longitudMinima, final int longitudMaxima ) {
		return longitudMinimaValida(valor , longitudMinima) 
				&& longitudMaximaValida(valor, longitudMaxima);
	}
	public static final boolean contieneSoloLetras(final String valor) {
		return obtenerValorDefecto(valor).matches(PATTERN_SOLO_LETRAS);
	}
}