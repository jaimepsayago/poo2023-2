package polimorfismo;

public class AppAnimal {

	public static void main(String[] args) {
		// operaciones polimorficas
		//crear un animal de tipo perro
		
		Animal animal = new Perro("bobby");
		animal.tipoAnimal();
		animal.comunicarse();
		System.out.println();
		
		//un obj de tipo perro
		Perro perro = new Perro("hercules");
		perro.tipoAnimal();
		System.out.println("------");
		
		//crear un ojbeto polimorfico, un obj perro de tipo animal
		//referenia a un objeto
		Animal animalPoli = perro;
		animalPoli.tipoAnimal();
		System.out.println("------");
		//obj gato de tipo animal
		
		Animal gato= new Gato("Lola");
		gato.tipoAnimal();
		gato.comunicarse();
		System.out.println("------");
		//objeto desde la interfaz
		//un gato desde la interfaz
		IAnimal gato2Animal = new Gato("lola");
		gato2Animal.comunicarse();
		System.out.println("------");
		//array de objeto con los metodos disponible
		Animal animales[]= {new Perro("simon"), 
				new Perro("paco"), new Gato("mimi"), new Perro("rocky")};
		//array de objetos de tipo animal y recorrerlo
		for(Animal a: animales) {
			System.out.println(a.getNombre());
			a.tipoAnimal();
			a.comunicarse();
			
		}
	}

}
