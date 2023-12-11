package polimorfismo;

public class Profesor extends Persona{
	private String idProfesor;

	public Profesor() {
		super();
		
	}

	public Profesor(String nombre, String apellido, int edad, String idProf) {
		super(nombre, apellido, edad);
		this.idProfesor=idProf;
	}

	public String getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}

	@Override
	public String toString() {
			return 	super.toString() + 
				"Profesor 	super.toString(); [idProfesor=" 
				+ idProfesor + "]";
	}

	
	
	
	

}
