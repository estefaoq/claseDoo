package co.edu.uco.tiendaonline.service.dto;

public final  class TipoIdentificacionDomain {
	
	private UUID id; 
	private String codigo; 
	private String nombre;
	private boolean estado; 
	
    }
	public TipoIdentificacionDomain(final UUID id, final String codigo, final String nombre, final boolean estado) {
		setId (id );
		setCodigo(codigo );
		setNombre(nombre);
		setEstado(estado);
	}	
	
	public static final TipoidentificacionDomain (final UUID id, final String codigo, final String nombre, final boolean estado) ){
		
	public TipoIdentificacionDTO() {
		setId  UUID (id ;
		setCodigo(codigo );
		setNombre(nombre);
		setEstado(estado);
		
		
		
	}
	

	public final UUID getId() {
		return id;
	}
	public final void  getId(final UUID id ) {
		this.id =  id;
	}
	public final String  getcodigo(final String codigo) {
		this.codigo = codigo;
	}
	public final String  getnombre(final String nombre) {
		this.nombre = nombre ;
		return this;
	}
	public final TipoIdentificacionDTO setnombre(final String nombre) {
		this.nombre = nombre ;
		return this;
	}
	public final boolean isEstado( ) {
	this.estado=estado; 
	return this;
	}

	public static Object crear(Object object, Object object2, String codigo2, boolean b) {
		// TODO Auto-generated method stub
		return null;
	}
}
