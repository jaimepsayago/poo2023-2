package gestiongimnasio.negocio;

import java.util.List;

import gestiongimnasio.datos.PersonasDatos;
import gestiongimnasio.encapsuladores.Deportista;
import gestiongimnasio.encapsuladores.Persona;
import gestiongimnasio.excepciones.GenericaException;

public class Personas {
	//si es que existe tres excepciones, dos de autenticacion y otra de perfil
	//visulizar personas
	public void introducir( List<Persona> listaPersonas, Persona persona) 
	throws GenericaException {
		if (persona.getResponsable() instanceof Deportista)
			throw new GenericaException(-50);
		new PersonasDatos().introducir(listaPersonas, persona);
	}
	
	public Persona autenticar(List<Persona> listaPersonas, Persona persona) 
	throws GenericaException{
	Persona personaEncontradas = new PersonasDatos().buscar(listaPersonas, persona);
	if (personaEncontradas == null)
		throw new GenericaException(-52);
	if (personaEncontradas.getPasswor().compareTo(persona.getPasswor())!=0)
		throw new GenericaException(-53);
	return personaEncontradas;
				
		
	}
	public List<Persona> visualizarPersonas(List<Persona> 
	listaPersonas, Persona personaAutenticada) 
	throws GenericaException{
		
		if ( personaAutenticada instanceof Deportista)
			throw new GenericaException(-50);
		List<Persona> listaPersonasACargo=
		new PersonasDatos().visualizarPersonas(listaPersonas, personaAutenticada);
	
		return listaPersonasACargo;
		
	}
	
}
