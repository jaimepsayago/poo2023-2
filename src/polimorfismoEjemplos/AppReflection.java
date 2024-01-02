package polimorfismoEjemplos;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AppReflection {

	public static void main(String[] args) throws Exception{
		Clase1 primerObjetoClase1 = new Clase1();
		primerObjetoClase1.setAtributo1("es importante donde estamos");
		primerObjetoClase1.setAtributo2(23);
		
		System.out.println("----------nombre de la clase-------");
		Class fichaInformacionClase1 = primerObjetoClase1.getClass();
		System.out.println("path y nombre de la clase: " +
							fichaInformacionClase1.getName());
		
		System.out.println("----------ATRIBUTOS-------");
		Field[] relacionAtributosClase1 = fichaInformacionClase1.getFields();
		for(int i=0; i<relacionAtributosClase1.length; i++) {
			System.out.println(relacionAtributosClase1[i].getName() + " " +
					relacionAtributosClase1[i].getType());
		}
		System.out.println("----------METODOS-------");
		Method[] relacionMetodos = primerObjetoClase1.getClass().getMethods();
		for(int i=0; i<relacionMetodos.length; i++) {
			String nombreMetodo = relacionMetodos[i].getName();
			System.out.println("METODO: " + nombreMetodo + 
					"  devuelve   " + relacionMetodos[i].getReturnType());
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
