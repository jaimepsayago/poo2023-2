package interfacesAbstractFiguraGeometricas;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AppFiguraDibujable extends JPanel {
//swing awt = pantallas de escritorio FX web
	// Grafics= dibujos
	//lines, elipses, cuadrados, texto, presentar imagenes
	public static void main(String[] args) {
		//borde y titulo de la ventana y el cuadro de la venta
		JFrame frame = new JFrame("Paint"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//panel o lienzo de mi clase principal o main
		//y agregar dentro de la ventana(Frame)
		AppFiguraDibujable panel= new AppFiguraDibujable();
		frame.add(panel);
		frame.setSize(800,800);
		frame.setVisible(true);
	}
	//generar el grafico metodo paint() crea componentes y agregar
	//con parametros de los objetos declarados
	public void paint(Graphics g) {
		//crear objeto rectDibujable y llamar al metodo
		RectanguloDibujable rd= new RectanguloDibujable(140.00,140.00,20,20);
		rd.dibujar2D(g);
		CirculoDibujable cd = new CirculoDibujable(80,40,44);
		cd.dibujar2D(g);
		RectanguloDibujable rd1= new RectanguloDibujable(140.00,140.00,80,80);
		rd1.dibujar2D(g);
		//cuadrado
		//triangulo
		//piramide
		//cono
		
	}
}
