package com.javaprogram.practice.threads;

/**
 * How to print even and odd numbers using threads in java
 * 
 * @author charvi
 *
 */
public class EvenOddThreadProgram {
	

	public static void main(String[] args) {
		SharedNumberResources shared = new SharedNumberResources();

		EvenThread evenThread = new EvenThread(shared, 20);
		Thread t1 = new Thread(evenThread);
		
		OddThread oddThread = new OddThread(shared, 20);
		Thread t2 = new Thread(oddThread);
		
		t1.start();
		t2.start();
	}
}

class SharedNumberResources {

	/*
	 * private int capacity;
	 * 
	 * public SharedNumberResources(int capacity) { this.capacity = capacity; }
	 */

	public synchronized void print(int number) {
		System.out.println(Thread.currentThread().getName() + " : " + number);
	}
	
	public synchronized void printOdd(int number) {
		System.out.println(Thread.currentThread().getName() + " : " + number);
	}

}

class EvenThread extends Thread {

	private SharedNumberResources sharedNumberResources;
	private int capacity;

	/**
	 * Parameterized Constructor
	 * 
	 * @param sharedNumberResources
	 * @param capacity
	 */
	public EvenThread(SharedNumberResources sharedNumberResources, int capacity) {
		this.sharedNumberResources = sharedNumberResources;
		this.capacity = capacity;
	}

	@Override
	public void run() {
		int start = 2;
		while (start <= capacity) {
			sharedNumberResources.print(start);
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			start= start +2;
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		notify();
	}

}

class OddThread extends Thread {


	private SharedNumberResources sharedNumberResources;
	private int capacity;

	/**
	 * Parameterized Constructor
	 * 
	 * @param sharedNumberResources
	 * @param capacity
	 */
	public OddThread(SharedNumberResources sharedNumberResources, int capacity) {
		this.sharedNumberResources = sharedNumberResources;
		this.capacity = capacity;
	}

	@Override
	public void run() {
		int start = 1;
		while (start <= capacity) {
			sharedNumberResources.print(start);
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			start= start +2;
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		notify();
	}
}