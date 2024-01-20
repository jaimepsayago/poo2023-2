package lambdas;

import java.util.function.Function;

public class AppInterfazFunction {

	public static void main(String[] args) {
		// interfaces funcionales 34 - function
		
		//creamos el objeto y lo implementamos con una expresino lambas
		Function<Integer, String> convertidor = x -> Integer.toString(x);
		System.out.println(convertidor.apply(12).length());
		System.out.println(convertidor.apply(120).length());
		
		//2 otra funcion
		Function<Integer, Integer> cuadrado = x -> x * x; 

		//vamos a utilizar la funcion convertidor
		System.out.println("el cuadrado de un numero es " + cuadrado.apply(5));
	
		
		//3 funciion contador de caracteres
		Function<String, Integer> contadorCaracteres = str -> str.length();
		String texto="codigo jaime sayago";
		System.out.println("el numero de caracteres es: " + contadorCaracteres.apply(texto));
		
		

	}

}
