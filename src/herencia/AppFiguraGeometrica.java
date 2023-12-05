package herencia;

public class AppFiguraGeometrica {

	public static void main(String[] args) {
		// implementar los objetos\\
		
		Cuadrado figura = new Cuadrado(5);
		System.out.println(figura.getArea());
		System.out.println(figura.getPerimetro());
		
		Triangulo t = new Triangulo(5, 2);
		System.out.println(t.getArea());
		System.out.println(t.getPerimetro());
		
		//implemntar objetos desde la clase padre
		FiguraGeometrica fg = new Cubo(9);
		System.out.println(fg.getArea());
		System.out.println(fg.getPerimetro());

		fg = new Cuadrado(6);
		System.out.println(fg.getArea());
		System.out.println(fg.getPerimetro());
		
	}

}
