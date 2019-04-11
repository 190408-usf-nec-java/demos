package com.revature.threads;

public class ThreadStatesLauncher {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		Thread sleepy = new Thread(new SleepyThread());
		Thread waiting = new Thread(new WaitingThread(sleepy));
		
		
		System.out.println(sleepy.getState());//should be new
		sleepy.start();
		System.out.println(sleepy.getState());//should be runnable
		
		
		Thread.sleep(500);
		System.out.println(sleepy.getState());//should be timed waiting
		waiting.start();
		
		Thread.sleep(500);
		System.out.println(waiting.getState());//should be waiting on sleepy
		
		Thread.sleep(3000);
		System.out.println(sleepy.getState());//should be terminated
		
		
	}
	
	
	

}
