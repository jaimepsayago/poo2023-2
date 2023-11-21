package poo;

public class ModuleApp {

	public static void main(String[] args) {
		// implementar objectos con la asociacion entre course y module
		//creasr objeto tipo course
		Course myCourse = new Course("software test", 5, 2000);
		//crear 3 objetos de tipo modulo
		Module mod1 = new Module("unit testing", 10, "practicum");
		Module mod2 = new Module("Acceptance testing", 20, "course");
		Module mod3 = new Module("values algorithm", 30, "none");
		//agregar los modulos al curso
		myCourse.addModule(mod1);
		myCourse.addModule(mod2);
		myCourse.addModule(mod3);
		//mostrar la informacion del detalle del curso
		System.out.println(myCourse.getName() 
				+ "contiene los siguientes modulos: ");
		for (int i =0;i<myCourse.getModuleCount();i++) {
			System.out.println(
				myCourse.getModules()[i].getName()	+ 
				myCourse.getModules()[i].getCreditPoints()	+ 
				myCourse.getModules()[i].getAssessment()	
					);
	
		}//end for
		System.out.println("total credits: "+myCourse.getTotalCredits());
		
		
	}

}
