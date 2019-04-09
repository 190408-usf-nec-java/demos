package com.revature.objects;

public class ObjectLauncher {

	
	public static void main(String[] args) {
		Animal bear = new Animal("brown", "Grizzly", 4, "Boo");
		
		System.out.println(bear);
		System.out.println(bear.eat("honey"));
		System.out.println(bear.move());

		Animal bear2 = new Bear("brown", "Black", 4, "BooHoo","White", "Fish");
		Bear bear3 = new Bear("white", "polar", 4, "Balto", "white");
		System.out.println(bear2);
		System.out.println(bear3);
		System.out.println(bear3.move());
		System.out.println(Bear.getNumBears());
		
	}
	
}
