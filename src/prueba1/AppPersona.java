package prueba1;

public class AppPersona {

	public static void main(String[] args) {
		
		Empresa empresa = new Empresa("google");
		
		Empleado empleado = new Empleado("juan", 40,1234);
		
		//agregar el objjeto empleado dentro de empresa
		empresa.setEmpleado(empleado);
		
		System.out.println("empleado");
		System.out.println(empresa.getEmpleado().getNombre());
		empresa.getEmpleado().mostrar();
		
	}

}
