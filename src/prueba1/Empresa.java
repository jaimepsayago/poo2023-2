package prueba1;

public class Empresa {

	private String nombre;
	//listas o con objetos
	Empleado empleado;
	Cliente cliente;
	
	public Empresa() {
		
	}
	
	public Empresa(String nombre) {
		this.nombre=nombre;
	}
	public Empresa(String nombre, Empleado empleado, Cliente cliente) {
		super();
		this.nombre = nombre;
		this.empleado = empleado;
		this.cliente = cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
