package com.revature.threads;

public class BlockingThread implements Runnable{

	private SynchronizedResource sr;
	
	public BlockingThread(SynchronizedResource sr) {
		this.sr = sr;
	}
	
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + "going to go count");
		sr.blockingResource();
		System.out.println(Thread.currentThread().getName() + "finished counting yipee");
	}

}
