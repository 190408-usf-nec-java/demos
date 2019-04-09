package com.revature.strings;

public class StringLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		String s2 = "hello";
		
		if(s == s2) {
			System.out.println("s equals s2");
		}
		
		String s3 = "he" + "llo";
		if(s3 == s) {
			System.out.println("s3 == s");
		}
		String s4 = "h";
		String s5 = "ello";
		String s6 = s4 + s5;
		if(s6 == s) {
			System.out.println("s6 == s");
		}
		String s7 = "helloworld".substring(0, 5);
		
		if(s7 == s) {
			System.out.println("s7 == s");
		}
		s7 = s7.intern();
		if(s7 == s) {
			System.out.println("s7 == s");
		}
		String s8 = new String("hello");
		if(s8 == s) {
			System.out.println("s8 == s");
		}
		StringBuilder sb = new StringBuilder("hello");
		sb.append(" world");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	}

}
