package polimorfismoEjemplos;

import java.util.ArrayList;
import java.util.List;

public class AppPublicacion {

	public static void main(String[] args) {
		// objetos y luego acceder a sus propiedades
		
		Revista rv = new Revista();
		rv.setSSN("1234=3--33");
		rv.setPeriodicidad("mensuall");
		rv.setNumero(2);
		rv.setTitulo("tierra y vida");
		rv.setAutor("Martinez");
		rv.setPrecio(6); 
		rv.setExtension(Integer.valueOf((int) 80));
		
		Libro libro = new Libro();
        libro.setISBN("978-5-29-123456-0");
        libro.setTitulo("Mundo Animal");
        libro.setAutor("Elena Pastor");
        libro.setPrecio(580);  
        
        List<Tomo> listaVolumenes = new ArrayList();
        
        Tomo tomo1 = new Tomo();
        tomo1.setNumeroVolumen((byte)1);
        tomo1.setTitulo("Los mamÃ­feros");
        tomo1.setNumeroPaginas(200);
        listaVolumenes.add(tomo1);
        
        Tomo tomo2 = new Tomo();
        tomo2.setNumeroVolumen((byte)2);
        tomo2.setTitulo("Los reptiles");
        tomo2.setNumeroPaginas(180);
        listaVolumenes.add(tomo2);
        
        libro.setExtension(listaVolumenes);
        
        System.out.println("----------  REVISTA  ----------");
        System.out.println("ISSN : "+rv.getSSN());
        System.out.println("Periodicidad : "+rv.getPeriodicidad());
        System.out.println("Numero : "+rv.getNumero());
        System.out.println("Titulo : "+rv.getTitulo());
        System.out.println("Autor : "+rv.getAutor());
        System.out.println("Precio : "+rv.getPrecio());
        
        System.out.println("----------  LIBRO  ----------");
        System.out.println("ISBN : "+libro.getISBN());
        System.out.println("Titulo : "+libro.getTitulo());
        System.out.println("Autor : "+libro.getAutor());
        System.out.println("Precio : "+libro.getPrecio());   
        
        
        System.out.println("VOLUMENES : ");
        System.out.println("--------------");
        System.out.println("Numero de volumnes de la obra : "+libro.getNumeroVolumenes());  

        
        List<Tomo> listaVolumenesGet =(List<Tomo>)libro.getExtension();
        	 for(int i=0; i<listaVolumenesGet.size();i++) {
        		 System.out.println("----------------------- ");
        		 Tomo tomo = listaVolumenesGet.get(i);
        	        System.out.println("-Volumn----" + tomo.getNumeroVolumen());
        	        System.out.println("-Titulo------" + tomo.getTitulo());
        	        System.out.println("-Num de paginas-" +  tomo.getNumeroPaginas());
        	 }
	}

}
