package herencia;

public class Cubo extends Cuadrado {

	public Cubo(int valor1) {
		super(valor1);
		
	}
	//sobrecargado override
	public double getArea() {
		return Math.pow(this.valor1,3);
	}

	
}
