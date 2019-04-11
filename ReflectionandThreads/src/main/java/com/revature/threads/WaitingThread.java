package com.revature.threads;

public class WaitingThread implements Runnable{

	private Thread threadToWaitOn;
	
	public WaitingThread(Thread t) {
		this.threadToWaitOn = t;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		try {
			threadToWaitOn.join();
		} catch(InterruptedException e) {
			
		}
	}

}
