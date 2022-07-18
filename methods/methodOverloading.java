package methods;

public class methodOverloading {

	public void method1(int a,int b) {
		
		System.out.println("Area of rectangle : "+(a*b));
	}
	
	public void method1(int c) {
	
		System.out.println("Area of circle    : "+(3.14*c*c));

	}
	
	public static void main(String[] args) {
		
		methodOverloading obj = new methodOverloading();
		
		obj.method1(5,6);
		obj.method1(5);
		
	}
}
