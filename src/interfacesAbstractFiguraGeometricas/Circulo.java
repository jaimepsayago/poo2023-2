package interfacesAbstractFiguraGeometricas;

public class Circulo extends FiguraGeometrica {

	public Circulo(double valor1) {
		super(valor1);
	}
	@Override
	public double getArea() {
		return Math.PI*Math.pow(this.valor1,2);
	}
	@Override
	public double getPerimeter() {
		return Math.PI*this.valor1;
	}

}
