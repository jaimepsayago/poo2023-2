package prueba1;

public class AppAutomovil {

	public static void main(String[] args) {
		Ambulancia ambulancia = new Ambulancia("blanco");
		ambulancia.encenderSirena(); //hijo
		ambulancia.pintar(); //padre
		
		Camion camion = new Camion("rojo", true);
		System.out.println("el camion esta cargado " 
				+camion.isEstaCargado());
		camion.pintar();
		
		Deportivo deportivo = new Deportivo("azul", 200) ;
		System.out.println("el deportivo la potencia " 
				+deportivo.getPotencia());
		deportivo.pintar();
		
	}

}
