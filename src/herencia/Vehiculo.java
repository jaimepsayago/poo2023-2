package herencia;

public class Vehiculo {
	public int ruedas;
	public double velocidad;
	
	public Vehiculo() {
		
	}
	public Vehiculo(int ruedas, double velocidad) {
		super();
		this.ruedas = ruedas;
		this.velocidad = velocidad;
	}
	
	//metodos
	public int acelerar(int a) {
		int v= 20;
		v = v + a;
		return v;
				
	}
	public int frenar() {
		return 0;
	}
	public int getRuedas() {
		return ruedas;
	}
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	


}
