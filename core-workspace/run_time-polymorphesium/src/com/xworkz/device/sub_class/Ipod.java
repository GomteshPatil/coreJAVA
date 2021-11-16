package com.xworkz.device.sub_class;

public class Ipod {

	private String modelNo;
	private String colour;

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	@Override
	public String toString() {
		System.out.println("Invoked tostring from Ipod");
		return "its two string";
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked hahCode from Ipod");
		return 100;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("good you are not passing null");

			if (obj instanceof Ipod) {
				System.out.println("thats right you passed Ipod type ref only");
				Ipod casted = (Ipod) obj;
				String checkWith = casted.getModelNo();
				if (this.modelNo.equals(checkWith)) {
					System.out.println("The model no is found both Ipods are same");
					return true;
				} else {
					System.err.println("Just miss model no. is not matching ");
				}
			}

			else {
				System.err.println("the value that you passed is not a instance of Ipod");
			}

		} else {
			System.err.println("Yak pa null kalsta ediya Ipod kalsu");
		}
		return false;
	}
}
