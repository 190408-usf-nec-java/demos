package com.revature.threads;

public class SleepyThread implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is the sleepy Thread, going to sleep");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Sleepy Thread wishes you a good morning");
	}

}
