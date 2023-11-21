package poo;

public class Human {
	//constante
	static final int LIFESPAN=100;
	
	public String name;
	int age;
	float height;
	
	//constructor
	//sirve para incicializar la variables
	
	public Human() {
		name="juan";
		age=23;
		height=130;
	}
	
	//datos desde el objeto
	public Human(String name, int age, float height) {
		this.name=name;
		this.age=age;
		this.height=height;

	}
	// encapsulacion
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
	//metodos codigo que retorna alguna resultado de una operacion
	
	/**
	 * computa e imprimir tiempo de vida
	 */
	public void computeAndPrintTtL() {
		int ttl = LIFESPAN - this.age;
		System.out.println("time to live: " + ttl);
	}
	
	//metodo de retorno de valores
	/**
	 * @return tiempo de vida
	 */
	public int getTimeToLive() {
		int ttl=LIFESPAN- this.age;
		return ttl;
	}
	
}
