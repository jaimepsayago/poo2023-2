package poo;

public class AppHumano {

	public static void main(String[] args) {

//crear un objeto
		Human human = new Human();
		
		System.out.println(human.getName());
		
		human.setAge(76);
		
		System.out.println(human.getAge());
		
		human.computeAndPrintTtL();
		System.out.println(human.getTimeToLive());

	}

}
