package lambdas;

public class AppStringProcessor {
	public static void main(String[] args) {
		
		StringProcessor stringProcessor = new StringProcessor() {
			@Override
			public String process(String x) {
				return x.toUpperCase();
			}
		}; 
		
		System.out.println(stringProcessor.process("hola"));
		
		//expresiones la inferencia
		//dependiendo del tipo que se se este utiliznado lambda se asocia automaticamente al tipo de datos
		
		
	}
}
