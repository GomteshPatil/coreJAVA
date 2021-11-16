package com.xworkz.dp;

import com.xworkz.dp.dao.ApplicationDAO;
import com.xworkz.dp.dto.ApplicationDTO;
import com.xworkz.dp.dto.FacebookApplicationDTO;
import com.xworkz.dp.dto.InstagramApplicatinDTO;

public class ApplicationStarter {

	public static void main(String[] args) {
		
		FacebookApplicationDTO facebookDTO1=new FacebookApplicationDTO("Mark Zuckarberg", "Menalo park california 22","Meta","Mark_Zuckarberg","343.0.013.177","Facebook");
		/*facebookDTO1.setCompany("Meta");
		facebookDTO1.setFounder("Mark_Zuckarberg");
		facebookDTO1.setVersion("343.0.013.177");
		facebookDTO1.setName("Facebook");*/
		
		FacebookApplicationDTO facebookDTO2=new FacebookApplicationDTO("Mark Zuckarberg", "Menalo park california 22","Meta","Mark_Zuckarberg","343.0.013.177","Facebook");
		
		
		InstagramApplicatinDTO instagramDTO=new InstagramApplicatinDTO(138, "India", "Instagram", "3.0.4.555", "Kevin Systrom","Meta");
		
		ApplicationDAO applicationDAO=new ApplicationDAO();
		applicationDAO.save(facebookDTO2);
		applicationDAO.save(facebookDTO1);
		applicationDAO.save(instagramDTO);
		applicationDAO.displayDetails();
		applicationDAO.displayDetailsOfInstagram();
		applicationDAO.findApplicationByName("Instagram");
	
		
		ApplicationDTO appDto=new FacebookApplicationDTO("ZOmato", "2.4.32.F12", "Amit", "Zomato", "Sahah", "food delivery");
		System.out.println(appDto.hashCode());
		FacebookApplicationDTO casteAppDto=(FacebookApplicationDTO)appDto;
		//casteAppDto.
		
		
		
		
	}

}
