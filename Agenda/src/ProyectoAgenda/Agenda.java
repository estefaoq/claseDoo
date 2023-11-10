package ProyectoAgenda;

public class Agenda {
	
	private Contacto[]contactos;
	
	public Agenda() {
		this.contactos = new Contacto[10];
	}
	
	public Agenda ( int tamanio) {
		this.contactos = new Contacto[tamanio];
	}
	
	public void aniadirContactos(Contacto c) {
		
		
		if (existeContacto(c)) {
			System.out.println("el contacto con ese nombre ya existe ");	
		}else if (agendaLlena()) {
			System.out.println("la agenda esta llena, no se pueden meter mas contactos");
		}else {
			
			
			boolean encontrado = false;
			for (int i=0;i<contactos.length && !encontrado; i++) {
				if (contactos[i]== null) {
					contactos[i]= c;
					encontrado = true;
				}
			}
			if (encontrado) {
				System.out.println("se ha aniadido");
			}else {
				System.out.println("no se ha podido aniadir");
			}
		}
	
		
		
		boolean encontrado = false;
		for(int i =0; i<contactos.length && !encontrado;i++) {
			if(contactos[i]==null) {
				contactos[i]=c;
				encontrado =true;		
			}
		}
		
		if (encontrado) {
			System.out.println("se ha anaido");
			
		}else {
			System.out.println("no se ha podido anadir");
		}
	}

	public boolean existeContacto(Contacto c ) {
		
		for(int i =0; i<contactos.length;i++) {
			if(contactos[i]==null && c.equals(contactos[i])) {
				return true;
			}
			
		}
		return false;
	}
	
	public void listarContacto() {
		if (huecosLibre() == contactos.length) {
			System.out.println("no hay contactos que mostrar");
		}else {
			for(int i =0; i<contactos.length;i++) {
				if(contactos[i]!=null) {
					System.out.println(contactos[i]);
				}
			}
		}
	}
	
	public void buscarPorNombre(String nombre) {
		
		boolean encontrado = false;
		for(int i =0; i<contactos.length && !encontrado;i++) {
			if (contactos[i]!=null && contactos [i].getNombre().trim().equalsIgnoreCase(nombre.trim())) {
				System.out.println("su telefono es " + contactos[i].getTelefono());
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("no se ha encontrado el contacto");
		}
	}
	public boolean agendaLlena() {
		for(int i =0; i<contactos.length ;i++) {
			if (contactos[i]==null ) {
				return false;
			}
		}
		
		return true; 
	}
	
	public void eliminarContacto(Contacto c ) {
		
		boolean encontrado = false;
		for (int i=0 ; i<contactos.length &&  !encontrado ;i++) {
			if (contactos[i]!=null && contactos[i].equals(c)) {
				contactos[i]=null; 
				encontrado = true;
			}
		}
		if (encontrado) {
			System.out.println("se ha eliminado el contacto");
			
		}else {
			System.out.println("no se ha eliminado el contacto");
			
		}
		
	}
	
	public int huecosLibre() {
		
		int contadorLibres=0;
		for (int i=0; i<contactos.length;i++) {
			if(contactos[i]==null) {
				contadorLibres++;
				
			}
		}
		return contadorLibres;
	}
	
	
	
	
}

