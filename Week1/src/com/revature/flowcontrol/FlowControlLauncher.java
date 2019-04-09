package com.revature.flowcontrol;

public class FlowControlLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int int1 = 0;
		
		
		
		if(int1 == 0) {
			System.out.println("int1 is: " + int1);
		}
		
		if(int1 == 1 || int1 == -1) {
			System.out.println("int1 is: " + int1);
		}else if((int1 == 2 || int1 == 3) && (int1 > 0)){
			System.out.println("int1 is: " + int1);
		} else {
			System.out.println("int1 is not 1 or 2");
		}
		
		while(int1 < 100) {
			System.out.println("while: int1 is: " + int1);
			int1++;
		}
		do {
			System.out.println("do while: int1 is: " + int1);
			int1++;
		}while(int1< 100);
		System.out.println("int1 is after do while: " + int1);
		
		for(; int1 > 0; int1--) {
			for(int j = 0; j < 3; j++) {
				System.out.println("int1 is: " + int1 + " j is: " + j);
			}
		}
		System.out.println("int1 is: " + int1);
		
		String day = "Tuesday";
		
		switch(day) {
		case "Monday": 
			System.out.println("Today is Monday");
			break;
		
		case "Tuesday":
			System.out.println("Today is Tuesday");
			break;
		default:
			System.out.println("I don't know what day it is");
		}
	}

}
