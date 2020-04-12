package com.ashish.producerConsumer;

import java.util.ArrayList;

public class ProducerConsumer {

	ArrayList<Integer> list = new ArrayList<Integer>();
	int capacity = 3;
	public static final int SLEEP_TIME = 5000;

	public void producer() throws InterruptedException{
		int value = 0;

		synchronized (this) {
			// producer thread waits while list
			// is full
			while(true){
			if(list.size() == capacity)
				wait();
			
				System.out.println("Producer produced : "+value);
				list.add(value++);
				notify();
				Thread.sleep(SLEEP_TIME);
			}
		}
	}
	public void consumer() throws InterruptedException{

		synchronized (this) {
			// consumer thread waits while list
			// is empty
			while(true){
			if(list.size() == 0)
				wait();
			
				int val = list.remove(0);
				System.out.println("Consumer consumed : "+ val);
				notify();
				Thread.sleep(SLEEP_TIME);
			}
		}
	}
}

