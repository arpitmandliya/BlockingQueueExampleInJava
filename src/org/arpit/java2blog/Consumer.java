package org.arpit.java2blog;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	BlockingQueue<String> queue=null;

	public Consumer(BlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}


	@Override
	public void run() {

		while(true)
		{
			try {
				System.out.println("Consumed "+queue.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
