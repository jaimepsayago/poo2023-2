package prueba1;

public class Cliente extends Persona {
public String nombreEmpresa;
public String telefonoContacto;

	public Cliente(String nombre, int edad,
			String nombreEmpresa, String telefonoContacto) {
		super(nombre, edad);
		this.nombreEmpresa=nombreEmpresa;
		this.telefonoContacto=telefonoContacto;
		
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getTelefonoContacto() {
		return telefonoContacto;
	}

	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}
	
	@Override
	public void mostrar() {
	super.mostrar();
	System.out.println("nombre empresa " + this.nombreEmpresa 
		+"" + this.telefonoContacto);
	}

}
