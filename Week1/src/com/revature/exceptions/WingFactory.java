package com.revature.exceptions;

public class WingFactory {

	private int totalWings = 200;
	
	private String type;
	
	private String name;
	
	public WingFactory(String type, String name) {
		this.type = type;
		this.name = name;
	}
	
	public String getWings(int numberOfWings) throws NoMoreWingsException {
		
		if(totalWings == 0) {
			throw new NoMoreWingsException();
		}
		if(numberOfWings > totalWings) {
			throw new NoMoreWingsException();
		}
		if(numberOfWings < 0) {
			return "Ask for a real number of wings please";
		}
		totalWings -= numberOfWings;
		
		return "Here are your " + numberOfWings + " wings";
	}
}
