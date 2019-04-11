package com.revature.reflections;

import java.lang.reflect.*;

import com.revature.models.Associate;

public class ReflectionsLauncher {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub

		Associate devin = new Associate("Devin", "volunteer", "555-55-5555", 55, "5-guys");
		System.out.println(devin.getSsn());
		
		Class<Associate> associateClass = Associate.class;
		
		for(Field f : associateClass.getDeclaredFields()) {
			System.out.println(f);
		}
		Field ssn = associateClass.getDeclaredField("ssn");
		ssn.setAccessible(true);
		ssn.set(devin, "HAHA YOU HAVE BEEN HACKED");
		System.out.println(devin);
	}

}
