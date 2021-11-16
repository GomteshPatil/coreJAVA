package com.xworkz.dp.dao;

import com.xworkz.dp.dto.CameraDTO;

public class CameraDAO {

	private CameraDTO[] cameraDTOs = new CameraDTO[30];
	private int ball = 0;

	public CameraDTO[] getcameraDTOs() {
		return cameraDTOs;
	}

	public void save(CameraDTO camera) {

		if (ball < this.cameraDTOs.length && camera != null) {

			this.cameraDTOs[ball++] = camera;
		} else {
			System.err.println("not abale to save to given index ");
		}

	}

	public void delete(int index) {
		if (index >= 0 && index < cameraDTOs.length && cameraDTOs[index] != null) {

			cameraDTOs[index] = null;
			System.out.println("Index " + index + " id deleted");
		} else {
			System.err.println("propved index is wrong or its already null");
		}
	}

	public void update(int no, CameraDTO update) {
		if (no >= 0 && no < cameraDTOs.length && cameraDTOs[no] != null) {

			cameraDTOs[no] = update;
			System.out.println("index " + no + " is updated");
		}
	}

}
