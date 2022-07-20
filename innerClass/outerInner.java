package innerClass;

public class outerInner {

	 public int a =  5;
	 public String  b = "Kishore";
	class outer{
		
		public void display() {
			System.out.println(a);
			System.out.println(b);
		}
	}
	
	public static void main(String[] args) {
		
		outerInner obj = new outerInner();
		outerInner.outer obj1 = obj.new outer();
		
		obj1.display();
		
	}
}
