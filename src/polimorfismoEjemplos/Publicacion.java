package polimorfismoEjemplos;
/**
 * publicacion
 * dos clases libro y revista  hijas y tomo 
 * y luego agregar metodos para ingresar y obtenr informacion
 * abstract de objeto e igualmente manejo de la clase Object
 */
public abstract class Publicacion {
	private String titulo, autor;
	private int precio;
	
	//metodo abstract de objeto
	//object es el padre de todas las clases de java
	//implementar o instancia cualquier clase considerando a Object como padre
	
	protected abstract void setExtension(Object informacion);
	protected abstract Object getExtension();
	//constructor
	public Publicacion()
	{
		
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
}
