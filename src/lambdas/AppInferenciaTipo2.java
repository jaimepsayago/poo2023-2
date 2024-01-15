package lambdas;

public class AppInferenciaTipo2 {

	public static void main(String[] args) {
		
		InferenciaTipo2 f = () -> System.out.println("hola mundo");
		
		AppInferenciaTipo2 test = new AppInferenciaTipo2();
		
		test.metodo(f);
		

	}
	//dependiente del tipo de datos la expresion se une con el tipo de dato de la funcion
	public void metodo(InferenciaTipo2 parametro) {
		parametro.accept();
	}

}
