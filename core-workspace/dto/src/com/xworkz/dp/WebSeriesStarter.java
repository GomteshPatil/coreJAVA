package com.xworkz.dp;

import com.xworkz.dp.constants.Genre;
import com.xworkz.dp.dao.WebSeriesDAO;
import com.xworkz.dp.dto.WebSeriesDTO;

public class WebSeriesStarter {

	public static void main(String[] args) {

		WebSeriesDTO weSeriesDTO1 = new WebSeriesDTO("whyKings", "24", 3400, 7.4F, 3, 3, Genre.THRILLER);

		WebSeriesDTO weSeriesDTO2= new WebSeriesDTO("Got", "749", 2600, 9.8F, 8, 8, Genre.HEASTRY);
		WebSeriesDTO weSeriesDTO3 = new WebSeriesDTO("Money Hiest", "749", 2600, 9.8F, 8, 8, Genre.HEISTS);
		WebSeriesDTO weSeriesDTO4 = new WebSeriesDTO("Asur", "749", 2600, 9.8F, 8, 8, Genre.CREAME);
		WebSeriesDTO weSeriesDTO5 = new WebSeriesDTO("Squid Games", "749", 2600, 9.8F, 8, 8, Genre.CREAME);
		WebSeriesDTO weSeriesDTO6 = new WebSeriesDTO("Dark", "749", 2600, 9.8F, 8, 8, Genre.TIME_TRAVEL);
		WebSeriesDTO weSeriesDTO7 = new WebSeriesDTO("Naruto", "749", 2600, 9.8F, 8, 8, Genre.ANIME);

		WebSeriesDAO seriesDAO = new WebSeriesDAO();
		seriesDAO.save(weSeriesDTO1);
		seriesDAO.save(weSeriesDTO2);
		seriesDAO.save(weSeriesDTO3);
		seriesDAO.save(weSeriesDTO4);
		seriesDAO.save(weSeriesDTO5);
		seriesDAO.save(weSeriesDTO6);
		seriesDAO.save(weSeriesDTO7);
		
		
		seriesDAO.delete(2);
		seriesDAO.update(2, weSeriesDTO7);

		WebSeriesDTO[] webSeries = seriesDAO.getWebSeriesDAOs();

		for (int no = 0; no < webSeries.length; no++) {
			WebSeriesDTO ref = webSeries[no];
			if (ref != null) {
				System.out.println("Web series Name : ".concat(ref.getName()));
				System.out.println("Web series genre : ".concat(String.valueOf(ref.getGenre())));
				System.out.println("Web series Reating : ".concat(String.valueOf(ref.getRating())));
				System.out.println("Web series Current Session : ".concat(String.valueOf(ref.getRating())));
				System.out.println("Web series Cast : ".concat(ref.getCast()));
				System.out.println("Total Session of web series : ".concat(String.valueOf(ref.getTotalSessions())));
				System.out.println("Web series total characters : ".concat(String.valueOf(ref.getRating())));
				
				
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			} else {
				System.err.println("Index ".concat(String.valueOf(no)).concat(" is pointing to null"));
			}

		}
	}
}
