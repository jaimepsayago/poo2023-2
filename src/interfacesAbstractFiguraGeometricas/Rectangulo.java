package interfacesAbstractFiguraGeometricas;

public class Rectangulo extends FiguraGeometrica {

	public double valor2;
	public Rectangulo(double valor1, double valor2) {
		super(valor1);
		this.valor2=valor2;
		
	}
//getters and setters
	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}
	//impl metodos abstractos
	@Override
	public double getArea() {
		return this.valor1*this.valor2;
	}
	@Override
	public double getPerimeter() {
		return 2*this.valor1+2*this.valor2;
	}

}
