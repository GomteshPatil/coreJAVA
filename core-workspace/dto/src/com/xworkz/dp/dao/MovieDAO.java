package com.xworkz.dp.dao;

import com.xworkz.dp.dto.movieDTO;

public class MovieDAO {

	private movieDTO[] movieDTOs = new movieDTO[10];
	private int chain = 0;

	public movieDTO[] getMovieDTOs() {
		return movieDTOs;
	}

	public void save(movieDTO name) {

		if (this.chain < this.movieDTOs.length && name != null) {
			System.out.println("Invoked save method & added movie : ".concat(name.getName()));
			this.movieDTOs[this.chain++] = name;

		} else {
			System.err.println("either you passing null or th array is full");
		}

	}

	public void save(movieDTO name, int dex) {

		if (dex < movieDTOs.length && name != null && dex >= 0) {
			System.out.println("Invoked overloaded save method & added movie : ".concat(name.getName()));
			movieDTOs[dex] = name;
			chain++;

		} else {
			System.err.println("either you passing null or th array is full");
		}

	}

	public int occupiedindex() {
		return chain;
	}

	public boolean findMovieByReating(float findReating) {

		System.out.println(
				"invoked find method and movie that to find is  by reating : ".concat(String.valueOf(findReating)));
		for (int i = 0; i < movieDTOs.length; i++) {
			movieDTO array = movieDTOs[i];
			if (array != null) {

				float movieRating = array.getRating();
				if (String.valueOf(findReating).equals(String.valueOf(movieRating)))
					;
				System.out.println("Movie of rating ".concat(String.valueOf(findReating)));
				return true;
			}
		}

		return false;
	}

}
