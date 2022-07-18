package methods;


public class callbyValue {

	int a = 200;
	
	int callBy(int a) {
		a = a*10/100;
		return(a);
	}
	
	public static void main(String[] args) {
		
		int a;
		callbyValue obj = new callbyValue();
	
		System.out.println("before call "+obj.a);
		obj.callBy(100);
		System.out.println("after call "+obj.a);
		
	}
}
