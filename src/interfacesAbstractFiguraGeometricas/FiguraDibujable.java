package interfacesAbstractFiguraGeometricas;

import java.awt.Graphics;

public interface FiguraDibujable {
	//coordenadas o datos
	public void serCoordenadas(int x, int y);
	//proceso de dibujar
	public void dibujar2D(Graphics g);

}
