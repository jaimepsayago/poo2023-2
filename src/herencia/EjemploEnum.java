package herencia;

public class EjemploEnum {

	public static void main(String[] args) {
		// implementar enum
		System.out.println(Gender.FEMALE);
		System.out.println(Gender.MALE);
		System.out.println(Gender.UNDEFINED.getDesc());
	}

}
