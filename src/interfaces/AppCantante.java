package interfaces;

public class AppCantante {

	public static void main(String[] args) {
		//trabajar con los objetos
		Persona p = new Persona();
		Canario c = new Canario();
		
		//necesito procesar los datos de canto

		hacerCantar(p);
		hacerCantar(c);
	}
	public static void hacerCantar(Cantante c) {
		c.cantar();
	}

}
