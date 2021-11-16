/*if (cname != null) {
			crudOperation.addBeachName("Om Beach");
			crudOperation.displayBeachNames();
			} 
	else {
			System.err.println("null pointer exception is occoured");
		}*/

package com.xworkz.beach;

import com.xworkz.beach.crud.CrudOperation;

public class BeachStarter {

	public static void main(String[] args) {

		CrudOperation crudOperation = new CrudOperation();
		String cname = crudOperation.getCountry();
		System.out.println(cname);
		crudOperation.addBeachName("Om Beach");
		crudOperation.displayBeachNames();
		crudOperation.addBeachName("karvar beach");
		crudOperation.displayBeachNames();
		crudOperation.addBeachName("Gokarna beach");
		crudOperation.addBeachName("Baba Beach");
		crudOperation.addBeachName("marvante beach");
		crudOperation.displayBeachNames();

	}

}
