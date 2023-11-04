package co.edu.uco.tiendaonline.service.businesslogic.validator.concrete.tipoidentificacion;



import co.edu.uco.tiendaonline.service.businesslogic.validator.Validator;
import co.edu.uco.tiendaonline.service.domain.tipoidentificacion.TipoIdentificacionDomain;
import co.edu.uco.tiendaonline.service.domain.tipoidentificacion.rules.CodigoTipoIdentificacionValidationRule;
import co.edu.uco.tiendaonline.service.domain.tipoidentificacion.rules.IdTipoIdentificacionValidationRule;
import co.edu.uco.tiendaonline.service.domain.tipoidentificacion.rules.NombreTipoIdentificacionValidationRule;
import co.edu.uco.tiendaonline.service.domain.tipoidentificacion.rules.TipoIdentificacionValidationRule;


public class ModificarTipoIdentificacionValidator implements Validator<TipoIdentificacionDomain> {
	
	private static final Validator<TipoIdentificacionDomain> instancia = new ModificarTipoIdentificacionValidator();
	
	@Override
	public final void execute(final TipoIdentificacionDomain data) {
			TipoIdentificacionValidationRule.ejecutarValidacion(data);
			IdTipoIdentificacionValidationRule.ejecutarValidacion(data.getId());
			CodigoTipoIdentificacionValidationRule.ejecutarValidacion(data.getCodigo());
			NombreTipoIdentificacionValidationRule.ejecutarValidacion(data.getNombre());
		
		
	}
	public static final void ejecutar (final TipoIdentificacionDomain data) {
		instancia.execute(data);
	}

	
}

