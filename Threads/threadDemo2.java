package Threads;

public class threadDemo2 implements Runnable{
  
	 public static int a = 0;
	 
	public void run() {
	
		try {
			while(a <= 10) {
				a++;
				System.out.println("Thread "+a);
				Thread.sleep(1000);
			}
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Exception in thread: "+e.getMessage());

		}
		
	}
	
	
	public static void main(String[] args) {
		
		 threadDemo2 obj = new threadDemo2();
		 
		 Thread obj1 = new Thread(obj);
		 
		 obj1.start();
	}
}
