package gestiongimnasio.presentacion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import gestiongimnasio.encapsuladores.Entrenador;
import gestiongimnasio.encapsuladores.Gerente;
import gestiongimnasio.encapsuladores.Persona;
import gestiongimnasio.excepciones.GenericaException;
import gestiongimnasio.negocio.Personas;

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
				System.out.println("--------");
				if (personaAutenticada !=null) {
					System.out.println("esta Ud conectado como: ");
					System.out.println("Usuario: ");
					System.out.println(personaAutenticada.getNombre()+" Perfil: ");
					if ( personaAutenticada instanceof Gerente) {
						System.out.println("gerente");
					}
					else {
						if(personaAutenticada instanceof Entrenador)
							System.out.println("Entrenador");
						else {
							System.out.println("deportista");
						}
					}
				}
				System.out.println("----------------");
				if (personaAutenticada == null)
					System.out.print("1.- loging");
				else {
					System.out.println("1.- desconectar");
					System.out.println("2.- introducir persona");
					System.out.println("3.- visualizar personas a su cargo");
				}
				System.out.println("4.- finalizar");
				System.out.println("----------------");
				System.out.println("Selecciones opcion: ");
				opcion = (byte)Integer.parseInt(bufferReader.readLine());
				switch(opcion) {
					case 1: if (personaAutenticada ==null)
								login();
							else
								desconectar();
							break;
					case 2: introducirPersona();
							break;
					case 3: visualizarPersonas();
							break;
				}
				
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

	public void login() throws Exception{
		BufferedReader bufferedReader = 
				new BufferedReader(new InputStreamReader(System.in));
		Persona persona = new Persona();
		System.out.println("introdici autenticacion");
		System.out.println("unicamente existe el gerente al inicio");
		System.out.println("dni 12345");
		System.out.println("pass 12345");
		System.out.println("introducir dni : ");
		persona.setDni(bufferedReader.readLine());
		System.out.println("introducir password");
		persona.setPasswor(bufferedReader.readLine());
		persona.setResponsable(personaAutenticada);
		//integrando la capa de presentacion con la capa de negocio
		personaAutenticada = new Personas().autenticar(listaPersonas, persona);
	}
	
	public void desconectar() {
		personaAutenticada=null;
	}
	public void  introducirPersona() throws Exception{
		BufferedReader bufferedReader = 
				new BufferedReader(new InputStreamReader(System.in));
		Persona persona = new Persona();
		System.out.println("introdici persona a su cargo");
		System.out.println("introducir dni : ");
		persona.setDni(bufferedReader.readLine());
		System.out.println("introducir password : ");
		persona.setPasswor(bufferedReader.readLine());
		System.out.println("introducir nombre : ");
		persona.setNombre(bufferedReader.readLine());
		persona.setResponsable(personaAutenticada);
		new Personas().introducir(listaPersonas, persona);
	}
	public void visualizarPersonas() throws GenericaException {
		List<Persona> listaPersonasACargo = 
		new Personas().visualizarPersonas(listaPersonas, personaAutenticada);
		
		System.out.println("Persona a cargo: " + personaAutenticada.getNombre());
		Persona persona;
		for (int i=0; i<listaPersonasACargo.size(); i++) {
			persona= listaPersonasACargo.get(i);
			System.out.println("dni " + persona.getDni()
			+" nombre: " + persona.getNombre() );
		}
	}
}
