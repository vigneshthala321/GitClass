package com.thread;

import java.util.concurrent.atomic.AtomicInteger;

//class sample{
//	AtomicInteger count = new AtomicInteger();
//
//	public void increment() {
//		count.incrementAndGet();
//	}
//}

public class Thread_1 {
	AtomicInteger count = new AtomicInteger();

	public void increment() {
		count.incrementAndGet();
	}

	public static void main(String[] args) throws InterruptedException {
		Thread_1 s = new Thread_1();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					s.increment();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					s.increment();
				}
			}
		});
		t1.start();
		t2.start();

		//Main thread should wait until t1 and t2 complete their action
		t1.join();
		t2.join();


		System.out.print(s.count);
		//thread safety by using wrapper class(atomic wrapper class)
		//Then we want to perform atomic operation for atomic wrapper class

	}

}
