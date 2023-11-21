package herencia;
/**
 * @author jaime
 * @date 11/21/2023
 * @since 1.0
 * 
 *  */
//enumerador o enum es una clase especial que limita la creacion de 
//objetos a unicamente los especificos de esta.

//PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO
public enum Gender {
	FEMALE(1, "f"),
	MALE(2, "m"),
	UNDEFINED(3, "u"){
		@SuppressWarnings("unused")
		public String commentDatos() {
			return "este es un mensaje desde enum" + getDesc();
			}
	};
		//otras variables como constantes
		private final int repr;
		private final String desc;
	
//constructor
	Gender(int repr, String desc){
		this.repr = repr;
		this.desc=desc;
	}

	public int getRepr() {
		return repr;
	}

	public String getDesc() {
		return desc;
	}
	
	
	
	
	}
	


	
	
	
	

