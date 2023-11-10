package ProyectoAgenda;

import java.util.InputMismatchException;
import java.util.Scanner;


public class menuAgenda {
	public static void menu( String[] args ) {
		
		Scanner sn = new Scanner(System.in);
		
		sn.useDelimiter("\n");
		
		boolean salir = false;
		int opcion; //guarda las opciones del usuario
		
		Agenda agendaTelefonica = new Agenda(3);
		String nombre;
		int telefono;
		
		Contacto c;
		
		
		while (!salir) {
			
			System.out.println("1. aniadir contacto ");
			System.out.println("2. listar contacto");
			System.out.println("3. buscar contacto ");
			System.out.println("4. existe contacto ");
			System.out.println("5. eliminar contacto ");
			System.out.println("6. contacto disponible ");
			System.out.println("7. agenda llena ");
			System.out.println("8. salir ");
			
			try {
			
			System.out.println("escribe que opcion necesitas");
			opcion= sn.nextInt();
			
			switch(opcion) {
			  case 1:
				  System.out.println("escribe un nombre");
				  nombre= sn.next();
				  System.out.println("escribe un telefono");
				  telefono= sn.nextInt();
				  
				  c = new Contacto(nombre, telefono);
				  
				  agendaTelefonica.aniadirContactos(c);
				  break;
			  case 2:
				  	agendaTelefonica.listarContacto();
				  break;
			  case 3:
				  
				  System.out.println("escribe un nombre");
				  nombre = sn.next();
				  agendaTelefonica.buscarPorNombre(nombre);
				  break;
			  case 4:
				  System.out.println("escribe un nombre");
				  nombre = sn.next();
				  c = new Contacto(nombre, 0 );
				   if (agendaTelefonica.existeContacto(c)) {
					   System.out.println("existe contacto");
				   }else {
					   System.out.println(" no existe ");
				   }
				  
				  break;
			  case 5:
				  
				  System.out.println("escribe un nombre");
				  nombre = sn.next();
				  c = new Contacto(nombre, 0 );
				  agendaTelefonica.eliminarContacto(c);
				  break;
			  case 6:
				  System.out.println("hay "+ agendaTelefonica.huecosLibre()+"contactos libres");
				  break;
			  case 7:
				  
				  if (agendaTelefonica.agendaLlena()) {
					  System.out.println("la genda esta llena ");
				  }else {
					  System.out.println("aunque puedes meter contactos");
				  }
				  break;
				  
				  
				  
			  case 8:
				  salir =true;
				  default:
					  System.out.println("las opciones son entre 1 y el 8 ");
					  
			}
			
			}catch(InputMismatchException e ) {
				System.out.println("debes un numero ");
				sn.next();
				
			}
		}
		
		System.out.println("fin del menu");
	}
}
