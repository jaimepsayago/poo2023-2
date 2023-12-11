package polimorfismo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListaProfesores {
	
	//operaciones de datos CRUD
	
	//instanciar una arraylist de tipo prfeosres 
	private ArrayList<Profesor> listProfesores;
	
	//constructor
	public ListaProfesores() {
		//iniciliazar el arraylist tipo profesor
		listProfesores = new ArrayList<Profesor>();
	}

	//agregar
	public void agregarProfesor(Profesor p) {
		listProfesores.add(p);
	}
	
	//listar
	public void listar() {
		System.out.println("lista todos los profesores");
		for (Profesor p: listProfesores)
			System.out.println(p.toString());
		
	}
	

}
