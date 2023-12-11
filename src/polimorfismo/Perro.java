package polimorfismo;

public class Perro extends Animal{
	public Perro() {
		super();
		
	}
	public Perro(String nombre) {
		super(nombre);
		System.out.println("constructor perro, nombre " + nombre);
	}
	@Override
	public void tipoAnimal() {
		System.out.println("tipo animal: es un perro");
		
	}
	public void comunicarse() {
		System.out.println("metodo comunicarse:perro ladra: guau!" );
	}

}
