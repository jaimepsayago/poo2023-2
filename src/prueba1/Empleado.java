package prueba1;

public class Empleado extends Persona{

	public double sueldoBruto;
	
	public Empleado(String nombre, int edad, 
			double sueldoBruto) {
		super(nombre, edad);
		this.sueldoBruto=sueldoBruto;
	}

	public double getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	public double calcularSalarioNeto() {
		return this.sueldoBruto - 20;
	}
	
	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("sueldo bruto " + sueldoBruto 
		+"" + this.calcularSalarioNeto());
	}
	
}
