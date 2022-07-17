package week1;


class privAccess {
    
	private void display1() {
		System.out.println("This is a private access");
	}
}

public class priAccess {

public static void main(String[] args) {
		
		
		System.out.println("\nPrivate Access Specifier");
		privAccess obj = new privAccess();
		
		//obj1.display1();
	}
}
