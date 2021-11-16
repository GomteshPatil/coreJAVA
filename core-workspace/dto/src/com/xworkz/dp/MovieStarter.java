package com.xworkz.dp;

import com.xworkz.dp.dao.MovieDAO;
import com.xworkz.dp.dto.movieDTO;

public class MovieStarter {

	public static void main(String[] args) {
		
		movieDTO moviDto1=new movieDTO();
		moviDto1.setName("John Wick");
		moviDto1.setActor("Keanu Reeves");
		moviDto1.setProducer("Anmol");
		moviDto1.setRating(6.8F);
		
		movieDTO movieDTO2=new movieDTO("John Carter", "Taylor Kitsch", 5.8F, "Rakesh");
		
		MovieDAO movieDAO=new MovieDAO();
		movieDAO.save(moviDto1);
		movieDAO.save(movieDTO2, 7);
		
		System.out.println(movieDAO.occupiedindex());
		
		System.out.println(movieDAO.findMovieByReating(6.8F));
		
	    movieDTO[] movieArray=movieDAO.getMovieDTOs();
	    
	    for (int window = 0; window < movieArray.length; window++) {
	    	movieDTO ref=movieArray[window];
	    	if(ref!=null) {
	    		System.out.println("movie name : ".concat(ref.getName()));
	    		System.out.println("Actor : ".concat(ref.getActor()));
	    		System.out.println("producer : ".concat(ref.getProducer()));
	    		System.out.println("Movie reating out of 10  : ".concat(String.valueOf(ref.getRating())));
	    		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	    		
	    	}
	    	else {
	    		System.err.println(String.valueOf(window).concat(" Index is still null or not saved"));
	    	}
		}
		
	}

}
