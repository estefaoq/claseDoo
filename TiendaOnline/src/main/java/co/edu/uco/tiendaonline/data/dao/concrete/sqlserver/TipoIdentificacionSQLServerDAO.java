package co.edu.uco.tiendaonline.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.tiendaonline.crosscutting.exception.concrete.DataTiendaOnlineException;
import co.edu.uco.tiendaonline.data.dao.TipoIdentificacionDAO;
import co.edu.uco.tiendaonline.data.dao.base.SQLDAO;
import co.edu.uco.tiendaonline.data.entity.TipoIdentificacionEntity;

public final class TipoIdentificacionSQLServerDAO extends SQLDAO implements TipoIdentificacionDAO {

	public TipoIdentificacionSQLServerDAO(final Connection conexion) {
		super(conexion);
	}

	@Override
	public final void crear(final TipoIdentificacionEntity entity) {
		// TODO Auto-generated method stub
		final StringBuilder sentencia = new StringBuilder();
		
		sentencia.append("INSERT INTO TipoIdentificacion ( id, codigo, nombre, estado) ");
		sentencia.append("VALUES ( ?, ?, ?, ? )" );
		
		try (final var sentenciaPreparada = getConexion().prepareStatement(sentencia.toString()) ){
			
			sentenciaPreparada.setObject(1, entity.getId());
			sentenciaPreparada.setString(2, entity.getCodigo());
			sentenciaPreparada.setString(3, entity.getNombre());
			sentenciaPreparada.setBoolean(4, entity.isEstado());
			
			sentenciaPreparada.executeUpdate();
		}
			
		}catch (final SQLException excepcion){
			var mensajeUsuario = "se ha presentado un problema tratando de registrar la informacion del nuevo tipo de identificacion ";
			var mensajeTecnico = " se ha presentado un problema de tipo SQLEXception en el metodo tipo identificacion tratando llevara acabo el tipo identificacion, por favor revisar";
			throw DataTiendaOnlineException.crear(mensajeUsuario, mensajeTecnico);
			
		} catch (final Exception excepcion) {
			var mensajeUsuario = "se ha presentado un problema tratando de registrar la informacion del nuevo tipo de identificacion ";
			var mensajeTecnico = " se ha presentado un problema de tipo SQLEXception en el metodo tipo identificacion tratando llevara acabo el tipo identificacion, por favor revisar";
			throw DataTiendaOnlineException.crear(excepcion, mensajeUsuario, mensajeTecnico);
			
		}
	}

	@Override
	public final void modificar(final TipoIdentificacionEntity entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public final void eliminar(final UUID id) {
		// TODO Auto-generated method stub

	}

	@Override
	public final Optional<TipoIdentificacionEntity> consultarPorId(final UUID id) {

		final var  sentencia = new StringBuilder();
		
		sentencia.append("SELECT  id, codigo, nombre, estado");
		sentencia.append("FROM TipoIdentificacion");
		sentencia.append("WHERE id = ? ");
		optional<TipoIdentificacionEntity> resultado = Optional.empty();
		try ( final var sentenciaPreparada = getConexion().prepareStatement(sentencia.toString())){
		 
				sentenciaPreparada.setObject(1, id);
				
				try (final var resultados = sentenciaPreparada.executeQuery()){
					
					if (resultados.netx()) {
						var tipoIdentificacionEntity=
								tipoIdentificacionEntity.crear(UUID.fromString(resultados.getObject("id").toString()),resultados.getObject("codigo", resultados.getString("nombre"),resultados.getString("estado"));
						resultado = Optional.of(tipoIdentificacionEntity);
					}
					{
				}catch(final SQLException excepcion) {
					var mensajeUsuario = "se ha presentado un problema tratando de registrar la informacion del nuevo tipo de identificacion ";
					var mensajeTecnico = " se ha presentado un problema de tipo SQLEXception en el metodo tipo identificacion tratando llevara acabo el tipo identificacion, por favor revisar";
					throw DataTiendaOnlineException.crear(excepcion,mensajeUsuario, mensajeTecnico);
		}
		}catch ( final DataTiendaOnlineException excepcion) {
			throw excepcion; 
		}
		return resultado;
		private final String formarSentenciaConsulta(final TipoIdentificacionEntity entity) {
			final StringBuilder sentencia = new StringBuilder();
			String operadorCondicional= "WHERE";
			sentencia.append("SELECT id, codigo, nombre, estado");
			sentencia.append("FROM TipoIdentificacion");

			if (!UtilObjeto.esNUlo(entity)) {
				if (!UtilObjeto.esNUlo(entity.getId())) {
					sentencia.append(operadorCondicional).append("id = ?");
					operadorCondicional = "AND"; 
				}
				if (!UtilTexto.estaVacio(entity.getCodigo())) {
					sentencia.append(operadorCondicional).append("codigo = ?");
					operadorCondicional = "AND";
				
				}
				if (!UtilTexto.estaVacio(entity.getNombre())) {
					sentencia.append(operadorCondicional).append("nombre = ?");
					operadorCondicional = "AND";
				}
				if (!UtilObjeto.estaVacio(entity.isEstado())) {
					sentencia.append(operadorCondicional).append("estado = ?");
	
				}
					
			}
			sentencia.append("ORDER BY codigo ASC");
		}
		return sentencia.toString(;)
	}

	@Override
	public final List<TipoIdentificacionEntity> consultar(final TipoIdentificacionEntity entity) {
		final var paarmetros = new ArrayList<Object>();
		//1.formar secuencia SQL, 
		final String secuencia = formarSentenciaConsulta(entity);
		//2.preparar secuencia SQL 
		final PreparedStatement sentenciaPreparada = prepararSentenciaConsulta(sentencia);
		//3.colocar los parametros
		colocarParametrosConsulta(sentenciaPreparada);
		//6.retornar resultados
		return ejecutarConsulta(sentenciaPreparada);
		
		
		return null;
	}
		
	
	private final void prepararEjecutarSentenciaConsultar(final String sentencia, final List<Object> parametros) {
		try(final var sentenciaPreparada = getConexion().prepareStatement(sentencia)){
			
			colocarParametrosConsulta(sentenciaPreparada, parametros);
			
		}catch (final SQLException excepcion) {
			
		}
	}
	private final void colocarParametrosConsulta(final PreparedStatement sentenciaPreparada,final List <Object> parametros) {
		try {
			for (int indice = 0; indice <parametros.size(); indice++) {
				sentenciaPreparada.setObject(indice + 1 , parametros.get(indice));
			}catch (final SQLException)
		}
	}
}

