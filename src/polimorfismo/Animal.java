package polimorfismo;

public abstract class Animal implements IAnimal {
	
	public String nombre;

	
	public Animal() {
		
	}
	public Animal(String nombre) {
		this.nombre=nombre;
		System.out.println("construcor Animal" + this.nombre );
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//implementar el metodo de la interfaz
	public void comunicarse() {
		System.out.println("metodo comunicarse: Animal");
	}
	
	// un metodo abstraacto
	public abstract void tipoAnimal();
	

}
