package co.edu.uco.tiendaonline.crosscutting.util;

import java.util.Random;
import java.util.UUID;

import co.edu.uco.tiendaonline.crosscutting.exception.concrete.DataTiendaOnlineException;
import co.edu.uco.tiendaonline.crosscutting.messages.CatalogoMensajes;
import co.edu.uco.tiendaonline.crosscutting.messages.enumerator.CodigoMensaje;

public class UtilUUID {
	
	private UtilUUID () {
		super();
	}
	public static UUID generarUUIDDefecto() {
        return new UUID(0L, 0L);
    }
	public static UUID convertirStringaUUID(String uuidString) {
        try {
            return UUID.fromString(uuidString);
        } catch (IllegalArgumentException excepcion) {
        	var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000040);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000058);
			throw DataTiendaOnlineException.crear(excepcion,mensajeUsuario,mensajeTecnico);
        }
    }
	public static UUID generarUUIDAleatorio() {
        Random random = new Random();
        long mas = random.nextLong();
        long menos = random.nextLong();
        return new UUID(mas, menos);
    }
	
}