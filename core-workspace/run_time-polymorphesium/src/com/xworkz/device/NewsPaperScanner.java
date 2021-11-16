package com.xworkz.device;

import com.xworkz.device.sub_class.constants.NewsPaper;

public class NewsPaperScanner {

	public static void main(String[] args) {

		NewsPaper newsPaper1 = new NewsPaper("Times of India", "English", 1892);
		NewsPaper newsPaper2 = new NewsPaper("Pudhari", "Marathi", 1982);
		NewsPaper newsPaper3 = new NewsPaper("Times of India", "English", 1892);

		System.out.println(newsPaper1.toString());
		System.out.println(newsPaper1.hashCode());

		System.out.println(newsPaper2.toString());
		System.out.println(newsPaper2.hashCode());

		System.out.println(newsPaper3.toString());
		System.out.println(newsPaper3.hashCode());

		System.out.println(newsPaper1.equals(newsPaper2) + "\n");
		System.out.println(newsPaper1.equals(newsPaper3) + "\n");
		System.out.println(newsPaper1.equals(null) + "\n");
		System.out.println(newsPaper1.equals(21) + "\n");

	}

}
