package gestiongimnasio.encapsuladores;

public class Persona {
	private String dni, passwor, nombre;
	private Persona responsable;
	public Persona() {
		
	}
	
	public Persona(String dni, String passwor, String nombre, Persona responsable) {
		this.dni = dni;
		this.passwor = passwor;
		this.nombre = nombre;
		this.responsable = responsable;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getPasswor() {
		return passwor;
	}

	public void setPasswor(String passwor) {
		this.passwor = passwor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona getResponsable() {
		return responsable;
	}

	public void setResponsable(Persona responsable) {
		this.responsable = responsable;
	}
	//metodo para retornar todo el objeto persona
	public Persona instanciaTransferirObjetoEspecifico (Persona p) {
		return p;
	}

}
