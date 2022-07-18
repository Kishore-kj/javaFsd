package week1;

public class accessModifiers {
	
	public void publicMethod() {
		System.out.println("Public method is accesile");
		
	}
	
	private void privateMethod() {
		System.out.println("Private method is accesile");
	}
    
	protected void protectedMethod() {
		System.out.println("Protected method is accesile");
	}
	
	void defaultMethod() {
		System.out.println("Default method is accesile");
	}
	public static void main(String[] args) {
	
		accessModifiers obj = new accessModifiers() ;
		obj.publicMethod();
		obj.privateMethod();
		obj.protectedMethod();
		obj.defaultMethod();
		
	}
}
