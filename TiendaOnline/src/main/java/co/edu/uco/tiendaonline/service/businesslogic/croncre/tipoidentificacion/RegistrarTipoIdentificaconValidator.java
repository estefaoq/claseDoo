package co.edu.uco.tiendaonline.service.businesslogic.croncre.tipoidentificacion;

public final  class RegistrarTipoIdentificaconValidator implements  Validator <TipoIdentificacion>{
	public final void excute ( final TipoIdentificacion data) {
		public final void excute ( final TipoIdentificacionDomain data) {
			IdTipoIdentificacionValidationRule.ejecutarValidacion(data.getId());
			codigoTipoIdentificacionValidationRule.ejecutarValidacion(data.getCodigo());
			NombreTipoIdentificacionValidationRule.ejecutarValidacion(data.getNombre());
		}
	}

}
