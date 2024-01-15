package lambdas;


public interface I2 {

	final String s="I2";
	
	//metodo statico
	static void method1() {
		System.out.println(s);
	}
	//metodo default
	default String method2(String x) {
		return s + x;
	}
	
	public void aceptar();
	
	
}
