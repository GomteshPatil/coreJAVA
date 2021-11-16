package com.xworkz.device.sub_class;

import com.xworkz.device.sub_class.constants.BagColour;
import com.xworkz.device.sub_class.constants.IceCreamFlavour;
import com.xworkz.device.sub_class.constants.IceCreamType;

public class IceCream {
	private String name;
	private IceCreamFlavour flavour;
	private IceCreamType type;

	public IceCream() {
		System.out.println("Invoked icecream no-arg const");
	}

	public IceCream(String name, IceCreamFlavour flavour, IceCreamType type) {
		super();
		this.name = name;
		this.flavour = flavour;
		this.type = type;
	}
	@Override
	public String toString() {
		System.out.println("Invoked toString from Bag");
		return "IceCream toString";
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked hashcode from Bag");
		return 21;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Right you are not passing null");
			if (obj instanceof IceCream) {
				System.out.println("ref that you passed is IceCream type");
				IceCream casted = (IceCream) obj;
				String nameToCheck = casted.getName();
				IceCreamFlavour flavourToCheck = casted.getFlavour();
				if (this.name.equals(nameToCheck) && this.flavour.equals(flavourToCheck)) {
					System.out.println("IceCream is found");
					return true;
				} else {
					System.err.println("IceCream miss match ");
				}
			} else {
				System.err.println("The ref that you passing is not of IceCream type");
			}
		} else {
			System.err.println("You passing null");
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public IceCreamFlavour getFlavour() {
		return flavour;
	}

	public IceCreamType getType() {
		return type;
	}

}
