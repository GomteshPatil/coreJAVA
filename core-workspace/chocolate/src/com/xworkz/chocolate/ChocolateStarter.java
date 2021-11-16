package com.xworkz.chocolate;

import com.xworkz.chocolate.operations.CrudChocolate;
import com.xworkz.chocolate.operations.GinCrud;
import com.xworkz.chocolate.operations.Island;
import com.xworkz.chocolate.operations.Resort;
import com.xworkz.chocolate.operations.Restaurant;
import com.xworkz.chocolate.operations.Rocket;

public class ChocolateStarter {

	public static void main(String[] args) {

		
		 CrudChocolate crudChocolate = new CrudChocolate(); String company =
		  crudChocolate.getParentCompany(); System.out.println(company);
		  crudChocolate.addChocolateName("Melody");
		 crudChocolate.displayChocolateName();
		  crudChocolate.addChocolateName("Dairy Milk");
		  crudChocolate.addChocolateName("Eclairs");
		  crudChocolate.addChocolateName(" Cadbury Dairy Milk Shots");
		  crudChocolate.addChocolateName("Halls");
		  crudChocolate.addChocolateName("Perk");
		  crudChocolate.addChocolateName("Dairy Milk Silk"); 
		  crudChocolate.addChocolateName("mentos");
		  crudChocolate.displayChocolateName();
		 

		GinCrud ginCrud = new GinCrud();
		System.out.println(ginCrud.getShopName());
		ginCrud.addGinNames("Bombay Sapphire");
		ginCrud.displayGinNames();
		ginCrud.addGinNames(" Botanist");
		ginCrud.addGinNames("Hapusa");
		ginCrud.addGinNames(" Tanqueray");
		ginCrud.addGinNames("Hendricks"); 
		ginCrud.addGinNames("Hendricks ");
		ginCrud.displayGinNames();
		ginCrud.addGinNames("mentos");
		
		Restaurant restaurant=new Restaurant();
		String resto=restaurant.getRestaurantName();
		System.out.println(resto);
		restaurant.addFoodMenu("Masala Papad");
		restaurant.displayFoodMenu();
		restaurant.addFoodMenu("Onion Pakoda");
		restaurant.addFoodMenu("chilli Masrum");
		restaurant.addFoodMenu("chicken chilli");
		restaurant.addFoodMenu("allu Pakoda");
		restaurant.addFoodMenu("guntur Chicken");
		restaurant.displayFoodMenu();
		
		
		Rocket rocket=new Rocket();
		String roc=rocket.getOrganization();
		System.out.println(roc);
		rocket.addRocketNames("GSLV-F10");
		rocket.displayRocketNames();
		rocket.addRocketNames("PSLV--C50");
		rocket.addRocketNames("PSLV-C49");
		rocket.addRocketNames("GSLV-MAC 3");
		rocket.addRocketNames("PSLV-C46");
		rocket.displayRocketNames();
		
		Resort resort=new Resort();
		String res=resort.getPlace();
		System.out.println(res);
		
		resort.addResortName("7apple");
		resort.addResortName("vivanta");
		resort.addResortName("taj");
		resort.addResortName("ambesetor");
		resort.addResortName("lemon tree");
		resort.displayResortNames();
		resort.addResortName("Chikk Tota");
		resort.displayResortNames();
		}



}
