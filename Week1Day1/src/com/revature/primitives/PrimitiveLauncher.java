package com.revature.primitives;

public class PrimitiveLauncher {

	public static void main(String[] args) {
		
		//byte is a single byte
		byte thisIsAByte = 5;
		
		System.out.println("byte: " + thisIsAByte);
		/* short 
		 * is
		 * 2
		 * bytes
		 */
		short s = 20;
		System.out.println("short: " + s);
		
		//char is 2 bytes and can take numbers or single characters
		char c = 'f';
		System.out.println("char: " + c);
		c = 100;
		System.out.println("char: " + c);
		
		//int is 4 bytes
		int i = Integer.MAX_VALUE;
		System.out.println("Int: " + i);
		
		//long 8 bytes
		long l = 5l;
		
		System.out.println("long: " + l);
		
		//floats are 4 bytes and decimal
		float f = 5.9f;
		
		System.out.println("float: " + f);
		
		//doubles are 8 bits and decimal
		double d = 9d;
		
		System.out.println("double: " + d);
		
		//booleans are true or false
		boolean bool = true;
		System.out.println("bool: " + bool);
		
	}

}
