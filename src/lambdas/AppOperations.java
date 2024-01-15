package lambdas;

public class AppOperations {

	public static void main(String[] args) {
		Operations op = (x,y) ->{
			System.out.println(x+y);
		};

		op.imprimeSuma(6, 12);
		
		//implementar con metodos 
		AppOperations obj = new AppOperations();
		obj.miMetodo(op, 24, 3);
		
		
	}
	public void miMetodo(Operations op, int x, int y) {
		op.imprimeSuma(x, y);
		
	}
	
	//tarea construir una calcualdora completa en base a este codigo

}
