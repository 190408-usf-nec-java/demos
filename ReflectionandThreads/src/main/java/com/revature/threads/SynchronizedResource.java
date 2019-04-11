package com.revature.threads;

public class SynchronizedResource {

	
	
	synchronized void blockingResource() {
		System.out.println(Thread.currentThread().getName() + "is counting to 2billion");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "has finished counting");
	}
	
	
	
}
