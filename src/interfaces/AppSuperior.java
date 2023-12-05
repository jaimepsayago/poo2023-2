package interfaces;

public class AppSuperior {

	public static void main(String[] args) {
		//instancias objetos de las sublcase
		SubClase1 pagoEfectivo = new SubClase1();
		
		SubClase2 pagoTarjeta = new SubClase2();
		
		//invocacion de los metodos de la subclase dependiendo
		//del parametro objeto
		 invocarMetodosSubclase(pagoEfectivo);
		 invocarMetodosSubclase(pagoTarjeta);
	}
	//implementar el metodo invocar metodos
	public static void invocarMetodosSubclase(Superior superior) {
		superior.visualizarCadena();
		System.out.println(superior.devolverNumero());
	}
	

}
