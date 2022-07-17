package week1;

class defaultAccess {
    
	void display() {
		System.out.println("This is a default class");
	}
}

class privateAccess {
    
	private void display1() {
		System.out.println("This is a private access");
	}
}



public class accessSpecifier1 {

	public static void main(String[] args) {
		
		System.out.println("Default Access Specifier");
		defaultAccess obj = new defaultAccess();
		obj.display();
		
		System.out.println("\nPrivate Access Specifier");
		privateAccess obj1 = new privateAccess();
		
		//obj1.display1();
	}

	
	
}
