package co.edu.uco.tiendaonline.data.entity;

public final class TipoIdentificacion {
	private UUID id;
	private String codigo;
	private String nombre;
	private boolean estado;
	private TipoIdentificacion(final UUID id, final string codigo,final string nombre, boolean estado) {
		super();
		setId(id);
		setCodigo(codigo);
		setNombre(nombre);
		setEstado(estado);
	} 
	public static final TipoIdentificacion crear (final UUID id, final string codigo,final string nombre, boolean estado ) {
		return new TipoIdentificacion(id, codigo, nombre,estado);
	}	
	private final void setId(final UUID id ) {
		this.id = id;
	}
	private final void setId(final String codigo ) {
		this.codigo= codigo ;
	}
	private final void setId(final String nombre ) {
		this.nombre = nombre;
	}
	private final void setId(final boolean estado ) {
		this.estado = estado;
	
	
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.estado = estado;
	} 

}
