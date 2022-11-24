package application;

import entities.IdCarro;
import entities.ListaCarro;
import entities.User;

public class Application {

	public static void main(String[] args) {
		
		ListaCarro listaCarro1 = new ListaCarro(1L, "Ferrari", "Esportivo");
		ListaCarro listaCarro2 = new ListaCarro(2L, "Fusca", "Casual");		
		
		IdCarro idListaCarro1 = new IdCarro(1L);
		idListaCarro1.addCarro(listaCarro1);
		
		IdCarro idListaCarro2 = new IdCarro(2L);
		idListaCarro2.addCarro(listaCarro2);
		
		User Paulo = new User(1L, "Paulo", "Paulinho", "123", "paulo@123.com"); 
		Paulo.addId(idListaCarro1);
		
		User Ricardo = new User(2L, "Ricardo", "rr", "12345", "rrsou@123.com");
		Ricardo.addId(idListaCarro2);
		
		
		System.out.print(Paulo.toString());	
		System.out.print("\n#################################\n");	
		System.out.print(Ricardo.toString());		

		

		
		
		

		
	}

}
