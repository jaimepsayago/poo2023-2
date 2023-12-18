package gestiongimnasio.encapsuladores;

public class Gerente extends Persona{
	@Override
	public Persona instanciaTransferirObjetoEspecifico(Persona p) {
		Persona entrenador = new Entrenador();
		entrenador.setDni(p.getDni());
		entrenador.setPasswor(p.getPasswor());
		entrenador.setNombre(p.getNombre());
		entrenador.setResponsable(p.getResponsable());
		return entrenador;
	}

}
