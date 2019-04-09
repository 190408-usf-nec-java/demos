package com.revature.exceptions;

public class WingFactory {

	private static WingFactory wf = null;
	
	private int totalWings = 200;
	
	private String name;
	
	private Wing[] wingTypes;
	
	private WingFactory() {
		this.name = "BWW";
		this.wingTypes = new Wing[5];
		wingTypes[0] = new Wing("Garlic Parm", "Boneless", 0);
		wingTypes[1] = new Wing("Barbaque", "Boneless", 0);
		wingTypes[2] = new Wing("Buffalo", "Boneless", 2);
		wingTypes[3] = new Wing("Spicy Hawaiian", "Boneless", 3);
		wingTypes[4] = new Wing("Mango Habanero", "Boneless", 4);
	}
	
	public static WingFactory getWingFactory() {
		if(wf == null) {
			buildFactory();
		}
		return wf;
	}
	
	
	private static void buildFactory() {
		wf = new WingFactory();
	}

	public String getWings(int numberOfWings, String type) throws NoMoreWingsException {
		
		if(totalWings == 0) {
			throw new NoMoreWingsException();
		}
		if(numberOfWings > totalWings) {
			throw new NoMoreWingsException();
		}
		if(numberOfWings < 0) {
			return "Ask for a real number of wings please";
		}
		boolean realWing = false;
		for(Wing w : wingTypes) {
			if(w.getName().equals(type)) {
				realWing = true;
			}
		}
		if(realWing) {
			totalWings -= numberOfWings;
			return "Here are your " + numberOfWings + " " + type + " wings";
		} else {
			return "I'm sorry, we don't serve " + type + " wings here";
		}
	}

	public String getName() {
		return name;
	}


	public Wing[] getWingTypes() {
		return wingTypes;
	}

	
	
	
}
