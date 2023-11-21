package herencia;

public class Coche extends Vehiculo {
	
	public int ruedas;
	public int gasolina;
	
	public Coche() {
		
	}
	public Coche(int ruedas, double velocidad, int gasolina) {
		super(ruedas, velocidad);
		this.gasolina=gasolina;
	}
	public int getRuedas() {
		return ruedas;
	}
	public void setRuedas(int ruedas) {
		//redefiniento el variable
		ruedas=4;
		this.ruedas = ruedas;
	}
	public int getGasolina() {
		return gasolina;
	}
	public void setGasolina(int gasolina) {
		this.gasolina = gasolina;
	}
	
	
	

}
