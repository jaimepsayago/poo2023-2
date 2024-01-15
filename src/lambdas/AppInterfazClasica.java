package lambdas;

public class AppInterfazClasica {

	public static void main(String[] args) {
		//clasico
		
		//I2.method1();
		
		I2 ObjC2 = new C2();
		I2 ObjC3 = new C3();
		
		System.out.println(ObjC2.method2("hola"));
		ObjC3.aceptar();
		
		//expresion lambdas
		I2 f = () -> {
			System.out.println("hola mundo exprsion lambdas");
		};
		//ejecuion del metodo implementado
		f.aceptar();
		

	}

}
