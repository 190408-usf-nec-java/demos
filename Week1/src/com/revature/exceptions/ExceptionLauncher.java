package com.revature.exceptions;

public class ExceptionLauncher {

	public static void main(String[] args) {
		WingFactory bww = WingFactory.getWingFactory();
		WingFactory qsl = WingFactory.getWingFactory();
		
		if(bww == qsl) {
			System.out.println("They are the exact same object in memory");
		}
	
		for(int i = 0; i < 50; i++) {
			try {
				System.out.println(bww.getWings(20, "Buffalo"));
			} catch (NoMoreWingsException e) {
				System.out.println("BWW has run out of wings");
			}
		}
	
	
	}
	
}
