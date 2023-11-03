package co.edu.uco.tiendaonline.data.entity.support;

public final class NumeroTelefonoMovilClienteEntity {
	private String numeroTelefonoMovil;
	private boolean numeroTelefonoMovilConfirmado;

	private NumeroTelefonoMovilClienteEntity(final String numeroTelefonoMovil,
			final boolean numeroTelefonoMovilConfirmado) {
		setNumeroTelefonoMovil(numeroTelefonoMovil);
		setNumeroTelefonoMovilConfirmado(numeroTelefonoMovilConfirmado);
	}

	public static final NumeroTelefonoMovilClienteEntity crear(final String numeroTelefonoMovil,
			final boolean numeroTelefonoMovilConfirmado) {
		return new NumeroTelefonoMovilClienteEntity(numeroTelefonoMovil, numeroTelefonoMovilConfirmado);
	}

	public final String getNumeroTelefonoMovil() {
		return numeroTelefonoMovil;
	}

	private final void setNumeroTelefonoMovil(final String numeroTelefonoMovil) {
		this.numeroTelefonoMovil = numeroTelefonoMovil;
	}

	public final boolean isNumeroTelefonoMovilConfirmado() {
		return numeroTelefonoMovilConfirmado;
	}

	private final void setNumeroTelefonoMovilConfirmado(final boolean numeroTelefonoMovilConfirmado) {
		this.numeroTelefonoMovilConfirmado = numeroTelefonoMovilConfirmado;
	}

}
