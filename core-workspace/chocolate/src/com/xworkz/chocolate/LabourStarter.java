package com.xworkz.chocolate;

import com.xworkz.chocolate.operations.Labour;

public class LabourStarter {

	public static void main(String[] args) {

		Labour labour = new Labour();
		labour.addLabourNames("Amit saha");
		labour.addLabourNames("Anil Ambani");
		labour.addLabourNames("Mukesh Ambani");
		labour.addLabourNames("Ramnath kovind");
		labour.addLabourNames("Narendra Modhi");
		labour.addLabourNames("Ayyapa");
		labour.addLabourNames("Harshad Mehata");
		labour.addLabourNames("Kumar Swami");

		labour.deleteLabourName(3);
		labour.updateLabourName(-4, "Siddaramayya");

		System.out.println("__________Labour Names are listed Below__________".concat("\n"));

		String[] ref = labour.getLabourname();
		for (int i = 0; i < ref.length; i++) {

			System.out.println("Labour Name :-->" + ref[i]);

		}

	}

}
