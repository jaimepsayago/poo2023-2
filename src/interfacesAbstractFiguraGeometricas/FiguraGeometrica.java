package interfacesAbstractFiguraGeometricas;
/*
 * FiguraGeometrica
 * interfaza FiguraDibujable
 * Circulo
 * CirculoDibujable
 * Rectangulo
 * RectanguloDibujable
 */

public abstract class FiguraGeometrica {
	protected double valor1;
	
	public FiguraGeometrica(double valor1) {
		this.valor1 = valor1;
	}
	public double getValor1() {
		return valor1;
	}
	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}
	//metodos
	public abstract double getArea();
	public abstract double getPerimeter();
	

}


