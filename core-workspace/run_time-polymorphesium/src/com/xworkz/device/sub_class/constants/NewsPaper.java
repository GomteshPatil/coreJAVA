package com.xworkz.device.sub_class.constants;

public class NewsPaper {

	private String name;
	private String language;
	private Integer since;

	public NewsPaper() {
		System.out.println("INvoked no arg const of NewsPaper");
	}

	public NewsPaper(String name, String language, Integer since) {
		super();
		this.name = name;
		this.language = language;
		this.since = since;
	}

	@Override
	public String toString() {
		System.out.println("Invoked toString from NewsPaper");
		return "Tire toString";
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked hashcode from NewsPaper");
		return 12;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("Good you are not passing null");
			if (obj instanceof NewsPaper) {
				NewsPaper casted = (NewsPaper) obj;
				String nameToCheck = casted.getName();
				Integer sinceToCheck = casted.getSince();
				if (this.name.equals(nameToCheck) && this.since.equals(sinceToCheck)) {
					System.out.println("The NewsPaper you looking is found");
					return true;
				} else {
					System.err.println("NewsPaper not found");
				}
			} else {
				System.err.println("You are not passing the NewsPaper data type");
			}
		} else {
			System.err.println("You passing null need to pass NewsPaper");
		}

		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Integer getSince() {
		return since;
	}

	public void setSince(Integer since) {
		this.since = since;
	}

}
