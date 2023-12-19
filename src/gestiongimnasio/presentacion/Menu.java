package gestiongimnasio.presentacion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import gestiongimnasio.encapsuladores.Gerente;
import gestiongimnasio.encapsuladores.Persona;
import gestiongimnasio.excepciones.GenericaException;

public class Menu {
	
	List<Persona> listaPersonas = new ArrayList();
	Persona personaAutenticada=null;
	
	//menu
	public void ejercutarMenu() {
		BufferedReader bufferReader = 
				new BufferedReader(new InputStreamReader(System.in));
		//persona con perfil de gerente que este registrado
		Persona gerente = new Gerente();
		gerente.setDni("12345");
		gerente.setPasswor("12345");
		gerente.setNombre("luis Calle");
		listaPersonas.add(gerente);
		
		byte opcion=0;
		do {
			try {
				
			} catch (GenericaException genericaExcepcion) {
				switch (genericaExcepcion.getCodigoErrror()) {
				case -50: System.out.println("no tiene privilegios de persona a su cargo");
				break;
				case -52: System.out.println("usuario no existe");
				break;
				case -53: System.out.println("password incorrecto");
				break;
				}
			}catch (Exception exception) {
				System.out.println(exception.getMessage());
			}
			
		}while (opcion !=4);
		
	}

}
