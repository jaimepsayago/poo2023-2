package interfaces;

public class SubClase2 implements Superior {

	@Override
	public void visualizarCadena() {
	System.out.println("visualizar Cadena subclase2-tarjeta de credito");
	}

	@Override
	public int devolverNumero() {
		return 499;
	}

}
