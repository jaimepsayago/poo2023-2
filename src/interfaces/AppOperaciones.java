package interfaces;

public class AppOperaciones {

	public static void main(String[] args) {
		//web
		//servicio web
		//awt
		//frontend- angular, vue, react, jsp
		//ingresar los datos
		OperacionImplementacion operaciones = new OperacionImplementacion();
		//datos Persona
		
		operaciones.insertarNombre(1, "juan");
		operaciones.actualizarNombre("pedro");
		operaciones.ejecutar("pablo");
		operaciones.EliminarNombre("pablo");
	}

}
