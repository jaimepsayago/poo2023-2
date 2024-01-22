package lambdas;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppLambdasEjercicioIteracion {

	public static void main(String[] args) {
		// generarr un stream y utilizaremos un loop automaticamente lo lea
		//realice una operacion intermedia de filttrado y a todos los elementos
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);
		
		List<Integer> resultado = numeros.stream()
					.filter(n -> n % 2 == 1) //impares 1, 3, 5
					.map(n -> n * n ) // a cada elemento 1, 9, 25
					//.reduce(0, Integer::sum);
					.collect(Collectors.toList());
		
		System.out.println(resultado);
		
		//streams con objetos
		//streams simple para mostrar datos
		Stream<String> stream1= Stream.of("intro java funcional");
		stream1.forEach(
				n -> System.out.println(n)
				);
		
		Stream<String> stream2= Stream.of("intro java funcional", "funcional 2", "stream 2");
		stream2.forEach(System.out::println);
		
		//crear un flujo secuencial a partir del array de objetos Estudiante
		String [] arr = {"java","8", "Stream", "API"};
		Stream<String> streams3= Arrays.stream(arr);
		System.out.println(Arrays.toString(streams3.toArray()));
		
		Stream<Estudiante> streamEstudiante = Stream.<Estudiante>builder()
							.add(new Estudiante(1, "juan","Calle",20))
							.add(new Estudiante(2, "maria","suarez",30))
							.add(new Estudiante(3, "pablo","torres",20))
							.build();
		
		streamEstudiante.forEach(estudiante -> System.out.println(estudiante.getId()));
		
		
		//Operaciones
		//filtrados, coleccione, maps, operaciones y finalmente imprimir, guardar los datos procesados
		
		//contar cadenas vacias
		List<String> strList=Arrays.asList("abc","bcd", "", "defg", "oidlell");
		long count = strList.stream()
							.filter(x -> x.isEmpty())
							.count();
		System.out.println("filtro: " + count);
		
		//ejemplo contar un string cuya longitud es superior a tres.
		
		long num = strList.stream()
					.filter(x -> x.length() >3)
					.count();
		System.out.println("filtro: " + num);
		
		//eliminar las cadenas vacias de la lista
		List<String> filtered = strList.stream()
								.filter(x -> !x.isBlank())
								.collect(Collectors.toList());
		System.out.println("filtro: " + filtered);
		
		//ejemplo para trabajar con los maps
		//creasr una lista y convertir cadenas a mayustucas y unirlas con comas
		
		List<String> g7 = Arrays.asList("usa", "japon", "francia","germany", "italy", "canada");
		String g7Stream = g7.stream()
							.map(x -> x.toUpperCase())
							.collect(Collectors.joining(", "));
		System.out.println("cadenas y unirlas con comas: " + g7Stream);

		//estadistica obtener el minimo, el maximo y suma y la media de los numeros
		List<Integer> primes = Arrays.asList(2,3,5,7,11,13,17,19,23,29);
		
		IntSummaryStatistics stats = primes.stream()
										.mapToInt((x)->x)
										.summaryStatistics();
		
		System.out.println("numero mas alto: " + stats.getMax());
		System.out.println("numero mas bajoj: " + stats.getMax());
		System.out.println("suma de todos los vvaloes: " + stats.getMax());
		System.out.println("average: " + stats.getAverage());
	}

}
