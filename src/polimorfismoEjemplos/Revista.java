package polimorfismoEjemplos;

public class Revista extends Publicacion {
	private String SSN, periodicidad;
	private int numero, numeroDePagina;
	
	
	public Revista() {
		super();
		
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public String getPeriodicidad() {
		return periodicidad;
	}

	public void setPeriodicidad(String periodicidad) {
		this.periodicidad = periodicidad;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumeroDePagina() {
		return numeroDePagina;
	}

	public void setNumeroDePagina(int numeroDePagina) {
		this.numeroDePagina = numeroDePagina;
	}

	@Override
	protected void setExtension(Object informacion) {
		//desencapsular los valores que vienen de tipo object
		numeroDePagina= ((Integer)informacion).intValue();
		
	}
	@Override
	protected Object getExtension() {
		//return new Integer(numeroDePagina);
		return Integer.valueOf((int) numeroDePagina);
	}

}
