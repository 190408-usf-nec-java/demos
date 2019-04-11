package com.revature.threads;

public class BlockingLauncher {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SynchronizedResource sr = new SynchronizedResource();
		Thread block1 = new Thread(new BlockingThread(sr));
		Thread block2 = new Thread(new BlockingThread(sr));
		
		block1.start();
		block2.start();
		
		while(true) {
			Thread.sleep(1000);
			System.out.println(block1.getName() + " state: " + block1.getState());
			System.out.println(block2.getName() + " state: " + block2.getState());
			
		}
		
		
	}

}
