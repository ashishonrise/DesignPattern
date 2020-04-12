package com.ashish.producerConsumer;

public class MainThread{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		final ProducerConsumer producerConsumer = new ProducerConsumer();
		Thread threadProducer = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					producerConsumer.producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread threadConsumer = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					producerConsumer.consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		threadConsumer.start();
		threadProducer.start();
		
		//threadConsumer.join();
		//threadProducer.join();
		
	}

}


