package com.thread;

public class Thread_2 {

	int count =0;
	public synchronized void increment() {
		count ++;
	}

	public static void main(String[] args) throws InterruptedException {
		Thread_2 s = new Thread_2();

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
		//we don't want both the threads to work with count at the same time
		//so we should use keyword "synchronized" before void
		//By using this keyword we tell,if t1 is accessing increment t2 has to wait
		//where t2 is accessing increment t1 has to wait




	}







}
