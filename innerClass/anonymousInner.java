package innerClass;

public class anonymousInner {
 
	 public static void main(String[] args) {
		 
		 Car feature = new Car() {
			 public void start() {
				 System.out.println("Special start feature");
			 }
			 public void stop() {
				 System.out.println("Special stop");
			 }
		 };
		 feature.start();
		 feature.stop();
	 }
}
