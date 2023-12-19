package gestiongimnasio.datos;

import java.util.ArrayList;
import java.util.List;

import gestiongimnasio.encapsuladores.Gerente;
import gestiongimnasio.encapsuladores.Persona;

/*
 * metodos de un CRUD de tipo de personas
 * add buscar, visualizar
 */
public class PersonasDatos {
	//agregar
	public void introducir(List<Persona> listaPersonas, Persona persona ) {
		//el objeto referencia a la subclase
		Persona personaRegistrar = 
		persona.getResponsable().instanciaTransferirObjetoEspecifico(persona);
		//agregar a la lista
		listaPersonas.add(personaRegistrar);
	}
	//buscar
	public Persona buscar(List<Persona> listaPersonas, Persona persona) {
		Persona personaEncontrada = null;
		boolean encontrada = false;
		
		Persona personaExtraidaLista;
		
		for(int i =0; i<listaPersonas.size() && !encontrada; i++) {
			personaExtraidaLista = listaPersonas.get(i);
		if ((personaExtraidaLista.getDni()).compareTo(persona.getDni())==0) {
				personaEncontrada= personaExtraidaLista;
				encontrada=true;
			}
		}
		return personaEncontrada;
	}
	
	//visualizar
	public List<Persona> visualizarPersonas(List<Persona> listaPersonas, 
			Persona personaAutenticada){
		List<Persona> listaPersonasACargo= new ArrayList<Persona>();
		Persona personaExtraidaLista;
	for(int i=0;i<listaPersonas.size(); i++) {
		personaExtraidaLista = listaPersonas.get(i);
		if(!(personaExtraidaLista instanceof Gerente)) //gerente no tiene el atributo resposanble
			if((personaExtraidaLista.getResponsable().
					getDni()).compareTo(personaAutenticada.getDni())==0)
				listaPersonasACargo.add(personaExtraidaLista);
			
		}
		return listaPersonasACargo;
	}
	
	

}
