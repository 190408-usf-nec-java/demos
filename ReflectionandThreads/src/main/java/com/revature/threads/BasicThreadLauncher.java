package com.revature.threads;

public class BasicThreadLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread bThread = new BasicThread();
		bThread.start();
		
		Thread rThread = new Thread(new BasicRunnable());
		
		rThread.start();
//		
//		while(true) {
//			System.out.println("I am the Main Thread");
//		}
		
	}

}
