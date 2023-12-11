package polimorfismo;

import java.util.Calendar;

public class AppProfesor {

	public static void main(String[] args) {
		//objeto de tipo profesor
		
		Profesor p1= new Profesor("juan","calle", 33, "prof-123");
		//fecha para agregar en un profesor interino
		Calendar fech1 = Calendar.getInstance();
		fech1.set(2021,01,22 );
		
		//objet de tipo profesor interino
		ProfesorInterino pi = 
			new ProfesorInterino("pablo","alvarez", 54,"prof-23",fech1);
		
		//objeto tipo lista para profeseores
		ListaProfesores listaProfes = new ListaProfesores();
		//agregar objetos a la lista de profesores
		listaProfes.agregarProfesor(p1); //profesor padre
		listaProfes.agregarProfesor(pi); //profesor interino hijo
		//estos objetos son diferetnes pero son subclase de la clase principal
		
		//mostrar los datos
		listaProfes.listar();

	}

}
