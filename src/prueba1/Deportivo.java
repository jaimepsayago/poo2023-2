package prueba1;

public class Deportivo extends Automovil {

	public int potencia;
	
	public Deportivo(String color, int potencia) {
		super(color);
		this.potencia=potencia;
		
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	
	
}
