package com.revature.objectsuper;

import com.revature.objects.*;

public class ObjectSuperLauncher {

	public static void main(String[] args) {
		Bear b1 = new Bear();
		Animal b2 = new Bear("Brown", "Polar", 4, "Bearington", "White");
		
		if(b1 == b2) {
			System.out.println("b1 and b2 are equal");
		}
		
		if(b1.equals(b2)) {
			System.out.println("b1 and b2 .equal");
		}
		
		b1 = (Bear)b2;
		
		if(b1 == b2) {
			System.out.println("b1 and b2 are equal");
		}
		
		if(b1.equals(b2)) {
			System.out.println("b1 .equals b2");
		}
		
		try {
			b1 = (Bear)b2.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(b1 == b2) {
			System.out.println("this probably shouldnt happen");
		}
		if(b1.equals(b2)) {
			System.out.println("b1 . equals b2 after cloning");
		}
	}
	
}
