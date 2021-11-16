package com.xworkz.dp.dao;

import com.xworkz.dp.dto.WebSeriesDTO;

public class WebSeriesDAO {

	private WebSeriesDTO[] webSeriesDAOs = new WebSeriesDTO[25];
	private int pai = 0;


	public WebSeriesDTO[] getWebSeriesDAOs() {
		return webSeriesDAOs;
	}

	public void save(WebSeriesDTO series) {

		if (pai < webSeriesDAOs.length && series != null)

		{
			System.out.println("Web series ".concat(series.getName()).concat(" is saved").concat("At index  ")
					.concat(String.valueOf(pai)));

			this.webSeriesDAOs[this.pai++] = series;

		} else {
			System.err.println("the index is full or you are passing null to index");
		}

	}

	public void delete(int index) {

		if (index >= 0 && index < webSeriesDAOs.length) {
			this.webSeriesDAOs[index] = null;
			System.out.println(String.valueOf(index).concat(" index is deleted"));
		} else {
			System.err.println("not able to delete");

		}
	}

	public void update(int dex, WebSeriesDTO name1) {

		if (dex >= 0 && dex < webSeriesDAOs.length) {

			this.webSeriesDAOs[dex] = name1;
			System.out.println("Index ".concat(String.valueOf(dex)).concat(" is updated"));
			
		} else {
			System.err.println("Updataion error");
		}
	}

}
