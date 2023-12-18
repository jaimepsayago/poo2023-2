package gestiongimnasio.excepciones;

public class GenericaException extends Exception{
	private int codigoError;
	
	public GenericaException(int codigoError) {
		this.codigoError= codigoError;
	}
	
	public int getCodigoErrror() {
		return codigoError;
	}

}
