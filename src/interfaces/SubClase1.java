package interfaces;

public class SubClase1 implements Superior{

	@Override
	public void visualizarCadena() {
		System.out.println("visualizar Cadena subclase1");
	}

	@Override
	public int devolverNumero() {
		return 18;
	}
}
