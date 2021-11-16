package com.xworkz.dp.dao;

import com.xworkz.dp.dto.IplDTO;

/**
 * @author Gomtesh Patil about- this class all about Crud operations on
 */

public class IplDAO {

	private IplDTO[] iplDTOs = new IplDTO[50];
	private int octopus = 0;

	public IplDTO[] getIplDTOs() {
		return iplDTOs;
	}

	public void create(IplDTO name) {
		System.out.println("Invoked method create");

		if (octopus < this.iplDTOs.length && name != null) {
			System.out.println("saved IPL team is ".concat(name.getName()));
			this.iplDTOs[this.octopus++] = name;
		} else {
			System.err.println("index is full or you passing null value");
		}

	}

	public void create(IplDTO name, int no) {

		System.out.println("Invoked create overloded method");
		if (no >= 0 && octopus < this.iplDTOs.length && name != null) {
			this.iplDTOs[no] = name;
			octopus++;
		} else {
			System.err.println("index is full or you passing null value");
		}

	}

	public int noOfIndexFull() {
		System.out.println("Invoked method count  ");
		// if (iplDTOs[octopus] != null) {

		return octopus;
	}

	public boolean matchTeamByNAme(String teamName) {

		System.out.println("invoked search method");
		System.out.println("Ipl team passed to search ".concat(teamName));

		for (int dethNote = 0; dethNote < iplDTOs.length; dethNote++) {
			IplDTO ref = iplDTOs[dethNote];
			if (ref != null) {
				System.out.println("ref in index is not null : ".concat(String.valueOf(dethNote)));
				String team = ref.getName();
				if (teamName.equals(team)) {
					System.out.println("Team name is found");
					return true;
				}

			}

		}

		return false;

	}

}
