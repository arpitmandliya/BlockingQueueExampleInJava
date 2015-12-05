package org.arpit.java2blog;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	BlockingQueue<String> queue=null;
	
	public Producer(BlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		for (int i = 1; i <=50; i++) {
			System.out.println("Produced item "+i);
			try {
				queue.put("item "+i);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
