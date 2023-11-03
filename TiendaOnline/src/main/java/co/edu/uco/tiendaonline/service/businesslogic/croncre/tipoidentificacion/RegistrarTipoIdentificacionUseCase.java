package co.edu.uco.tiendaonline.service.businesslogic.croncre.tipoidentificacion;

import java.util.UUID;

import co.edu.uco.tiendaonline.crosscutting.util.UtilObjeto;
import co.edu.uco.tiendaonline.data.dao.TipoIdentificacionDAO;
import co.edu.uco.tiendaonline.data.dao.daofactory.DAOFactory;
import co.edu.uco.tiendaonline.service.dto.TipoIdentificacionDomain;
import co.edu.uco.tiendaonline.service.mapper.entity.concrete.TipoIdentifacacionEntityMapper;

public class RegistrarTipoIdentificacionUseCase implements UseCase<TipoIdentificacionDomain>{
	private final DAOFactory factoria;
	private final TipoIdentificacionDAO tipoidentificacionDAO;
	
	public final  RegistrarTipoIdentificacionUseCase final DAOFactory factoria) {
		setFactoria(factoria);
		
		
	}
	public final void execute( TipoIdentificacionDomain domain) {
		
		domain = obtenerIdentificacionTipoIdentificacion(domain);
		validarNoExistenciaTipoIdentificacionConMismoCodigo(domain.getcodigo());
		validarNoExistenciaTipoIdentificacionConMisNombres(domain.getnombre());
		registarNuevoTipoIdentificacion(domain);
	}
	
	private final void registarNuevoTipoIdentificacion(final TipoIdentificacionDomain domain) {
		var entity = TipoIdentifacacionEntityMapper.convertToEntity(domain);
		getTipoIdentificacionDAO().crear(entity);
		
	}
	private final void validarNoExistenciaTipoIdentificacionConMisNombres(final String nombre) {
		var domain = TipoIdentificacionDomain.crear(null, null , nombre, false );
		var entity = TipoIdentifacacionEntityMapper.convertToEntity(domain);
		var resultado = getTipoIdentifacacionDAO().consultar(entity);
		
		if (!resultado.isEmpty()) {
			var mensajeUsuario = "";
			throw ServiceTiendaOnlineException.crear(mensajeUsaurio);
		}
		
	}
	private final TipoIdentificacionDomain  obtenerIdentificacionTipoIdentificacion(TipoIdentificacionDomain domain) {
		optional<TipoIdentificacionEntity> optional ;
		UUID uuid; 
		do {
			var uuid = UUID.randomUUID();
			reesultados = getTipoIdentificacionDAO().consultarPorId(uuid);
		}while(optional.isPresent());
		return TipoIdentificacionDomain.crear(uuid, domain.getCodigo(),  domain.getNombre(),  domain.getisEstado());
		
	}
	private final DAOFactory getFactoria() {
		return factoria;
	}
	
	private final void validarNoExistenciaTipoIdentificacionConMismoCodigo(final String codigo) {
		var domain = TipoIdentificacionDomain.crear(null, null , codigo, false );
		var entity = TipoIdentifacacionEntityMapper.convertToEntity(domain);
		var resultado = getTipoIdentifacacionDAO().consultar(entity);
		
		if (!resultado.isEmpty()) {
			var mensajeUsuario = "";
			throw ServiceTiendaOnlineException.crear(mensajeUsaurio);
		}
	}
	private final DAOFactory getFactoria() {
		return factoria;
	}
 private final void setFactoria( DAOFactory factoria) {
	 if (UtilObjeto.esNulo(factoria)) {
		 var mensajeUsuario = "";
		 var mensajeTecnico = "";
		 throw ServiceTiendaOnlineException.crear(mensajeUsaurio,mensajeTecnico);
	 }
	 this.factoria = factoria; 
 }
 private final TipoIdentificacionDAO get TipoIdentificacionDAO() {
	 return getFactoria().obtenerTipoIdentificacionDAO()
 }
}
