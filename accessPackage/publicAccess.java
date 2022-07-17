package accessPackage;
import week1.*;

public class publicAccess extends publicAccess1{
 
	public static void main(String[] args) {
		
		System.out.println("Public Access specifier");
		
		publicAccess obj = new publicAccess();
		
		obj.display();
		
		
	}
}
