package Threads;

public class threadDemo extends Thread {

	public void run() {
		System.out.println("Thread created");
	}
	public static void main(String[] args) {
		threadDemo obj1 = new threadDemo();
		
		obj1.start();
		
	}
}
