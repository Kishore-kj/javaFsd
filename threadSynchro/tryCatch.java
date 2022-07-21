package threadSynchro;

public class tryCatch {
  
	public static void main(String[] args) {
		int[] Array = new int[4];
		
		try {
			Array[7] = 3;
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Exception"+e);
			
		}
		finally {
			System.out.println("Array length "+Array.length);
		}
		
	}
}
