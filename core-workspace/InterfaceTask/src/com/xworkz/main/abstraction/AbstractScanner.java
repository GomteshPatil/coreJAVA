package com.xworkz.main.abstraction;

import com.xworkz.main.constants.BirdDTO;
import com.xworkz.main.interfaces.BirdCrudImplemented;
import com.xworkz.main.interfaces.BirdCurd;

public class AbstractScanner {

	public static void main(String[] args) {
		
		BirdDTO bird1=new BirdDTO( "21","Sparaw", 4, "USA" ,true);
		BirdDTO bird2=new BirdDTO("22B", "Ostric", 12, "Africa", false);
		BirdDTO bird3=new BirdDTO("22B", "Parrot", 12, "India", true);
		
		
		BirdCurd Implimented=new BirdCrudImplemented();
		
		BirdAbstracted abstraction=new BirdAbstracted(Implimented);
		abstraction.save(bird1);
		abstraction.save(bird2);
		abstraction.save(bird3);
		abstraction.save(null);
		
		abstraction.findByAge(4);
		abstraction.findByAge(12);
		abstraction.findByAge(0);
		
		abstraction.display();
		
		
		
		
			
		
		

	}

}
