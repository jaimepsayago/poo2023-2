package lambdas;

@FunctionalInterface
public interface StringProcessor {
	final String s="SP";
	
	//metodo abstracto
	String process(String x);

	//metodo statico
		static void method1() {
			System.out.println(s);
		}
		//metodo default
		default String method2(String x) {
			return s + x;
		}
		
}
