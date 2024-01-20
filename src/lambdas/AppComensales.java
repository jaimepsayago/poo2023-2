package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class AppComensales {

	public static void main(String[] args) {
		//lista de varios comensales
		List<Comensales> listaComensales = 
				Arrays.asList(
						new Comensales("jaime", 20,5),
						new Comensales("juan", 30,59),
						new Comensales("pedro", 14,52),
						new Comensales("maria", 39,34),
						new Comensales("alberto", 93,54)
						);
		
//obtener el nombre de algun de datos de lista
		
		List<Object> nombreComensales = getDataComensales(listaComensales, x->x.getNombre());
		
		//muestre la aplicascion de la interfaz function aplicada a la lista de comensales
		System.out.println("lista de nombres de comensales es: ");
		for(Object n:nombreComensales) {
			System.out.println("nombre: " + n);
		}
		
		//obtenga el monto de los comensalels
		List<Object> montoComensales = getDataComensales(listaComensales, x->x.getMonto());
		System.out.println("lista de montos de comensales es: ");
		for(Object m:montoComensales) {
			System.out.println("montos: " + m);
		}
	}
	//leer yobtener los datos del array list
	public static List<Object> getDataComensales (List<Comensales> listaCom, Function<Comensales, Object> func){
		//esta lista guarda los datos personalizados de los comensales
		List<Object> listaDatos= new ArrayList<>();
		//iterar los datos de la lista de comensales que recibimos
		for(Comensales comensal: listaCom) {
			listaDatos.add(func.apply(comensal));
		}
		return listaDatos;
	}
}
