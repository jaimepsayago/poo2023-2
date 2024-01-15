package repaso;

import java.util.ArrayList;

public class AppInformacion {

	public static void main(String[] args) {
		//objeto persona y trabajador
		Persona p1 = new Persona("Ana", "Garcia", 26);
		Persona p2 = new Persona();
		p2.setNombre("Antonio");
		p2.setApellido("Ruiz");
		p2.setEdad(34);
		
		Trabajador t1 = new Trabajador("Luis", "Rodriguez",24,1200);
		Trabajador t2 = new Trabajador("Juan", "Calle",26,1800);
		
		//una lista donde agregar todas lapersnas y trabajadores
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		//agregar los datos
		listaPersonas.add(p1);
		listaPersonas.add(p2);
		listaPersonas.add(t1);
		listaPersonas.add(t2);
 		
		//mostrar la infomracion
		for (int i = 0; i<listaPersonas.size();i++) {
			System.out.println(listaPersonas.get(i).toString());
			listaPersonas.get(i).calcularPaga();
			//listaPersonas.get(i).edad();
		}
//Tarea. 
//1. Agregar clase Ejecutivo y agregar un campo de hora extra y salario
//2. Agregar 5 objetos de ejecutivos
//3. Calcular que los sueldos mayores a 3500 y 45 horas extras 
		//tienen un bono del 12.5%
//4. Calcular que los sueldos mayor a 4000 y las horas extras 
		//entre 50 y 60  tienen un bono del 14%
//5. Sobrecargar el metodo calculaPaga y mostrar en consola
//6. Crear una interfaz para Calcular la edad de la persona,
		//agregar los campos necesarios para esta operacion
//7. presentar un metodo edad y mostrar por consola la edad		

		
		
	}

}
