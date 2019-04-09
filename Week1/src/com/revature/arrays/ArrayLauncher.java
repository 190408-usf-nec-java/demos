package com.revature.arrays;

import java.util.Arrays;

public class ArrayLauncher {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		String[] strArr = new String[10];
		boolean[] boolArr = new boolean[10];
		System.out.println(numArr.length);
		//gives index out of bounds exception
//		numArr[10] = 0;
		
		System.out.println(numArr);
		System.out.println(Arrays.toString(numArr));
		System.out.println(Arrays.toString(strArr));
		System.out.println(Arrays.toString(boolArr));
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = i;
			System.out.println(Arrays.toString(numArr));
		}
		
		for(int i : numArr) {
			System.out.println(i);
		}
	}

}
