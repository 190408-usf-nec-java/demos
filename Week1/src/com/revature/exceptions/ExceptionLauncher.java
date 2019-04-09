package com.revature.exceptions;

public class ExceptionLauncher {

	public static void main(String[] args) {
		WingFactory bww = new WingFactory("boneless", "Garlic Parmesan");
		WingFactory quakerSteak = new WingFactory("2DayOldwings", "Dirty Socks");
	
		for(int i = 0; i < 50; i++) {
			try {
				System.out.println(bww.getWings(20));
			} catch (NoMoreWingsException e) {
				try {
					System.out.println(quakerSteak.getWings(40));
				} catch (NoMoreWingsException e1) {
					System.out.println("Somehow, quaker steak ran out of dirty sock wings");
				}	
			}
		}
	
	
	}
	
}
