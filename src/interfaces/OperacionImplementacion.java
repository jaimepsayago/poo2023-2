package interfaces;

public class OperacionImplementacion implements OperacionesCrud, OperacionesCrudEliminar{

	@Override
	public String EliminarNombre(String nombre) {
		//operaciones a la base de datos
		System.out.println("nombre eliminado correctamente");
		return "ok-eliminado";
	}

	@Override
	public String insertarNombre(int id, String nombre) {
		System.out.println("nombre insertado correctamente");
		return "ok-insertar";
	}

	@Override
	public String actualizarNombre(String nombre) {
		System.out.println("nombre actualizado correctamente");
		return "ok-actualizado";
	}

	@Override
	public String ejecutar(String nombre) {
		System.out.println("nombre ejecutado correctamente");
		return "ok-ejecutado";
	}

}
