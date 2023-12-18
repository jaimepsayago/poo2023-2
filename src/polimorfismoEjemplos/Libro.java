package polimorfismoEjemplos;

import java.util.List;

public class Libro extends Publicacion {
	private String ISBN;
	//arraylist de tipo tomo 
	List<Tomo> listaVolumenes;
	
	public Libro(){
		super();
	}

	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	@Override
	protected void setExtension(Object informacion) {
		// desencapsular al objeto informacion y luego agregarlo a listaVolumnes
	listaVolumenes = (List<Tomo>)informacion;
		
	}
	@Override
	protected Object getExtension() {
		return listaVolumenes;
	}
	//metodo para saber el tamano de listavolumenes
	public int getNumeroVolumenes() {
		return listaVolumenes.size();
	}
	

}
