package lambdas;

public class AppSintaxis {

	public static void main(String[] args) {
		//normal
		CSintaxis interfaceNormal = new CSintaxis();
		interfaceNormal.aceptar();
		
		//lambadas
		//si yo tengo una sola expresion 
		// quitar {}
		Sintaxis f = () -> {
		System.out.println("hola mundoexprension lambda");
			
		};
		f.aceptar();
		
	}

}
