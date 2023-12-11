package polimorfismo;

public class Gato extends Animal {
	public Gato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gato(String nombre) {
		super(nombre);
		System.out.println("constructor gato" + nombre);
	}

	//abstract no esta implementado
	@Override
	public void tipoAnimal() {
		System.out.println("tipo animal: es un gato");
	}
	//comunicarse
	//@Override no es necesario ya esta implementado en Animcal
	public void comunicarse() {
		System.out.println("metodo comunicarse:gato maulla: miua" );
	}

}
