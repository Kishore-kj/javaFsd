package emailValidation;
import java.util.*;

public class emailValidation {

	 public static void main(String[] args) {
		 
		 ArrayList<String> ev = new ArrayList<String>();
		 
		 Scanner sc = new Scanner(System.in);
		 
		 String email;
		 
		 ev.add("kishorekumar@gmail.com");
		 ev.add("nitheeshkumar@gmail.com");
		 ev.add("monesh@yahoo.com");
		 ev.add("ajjey@reddifmail.com");
		 ev.add("kumaran@yahoo.com");
		 
		 System.out.println("Enter the email ID : " );
		 email = sc.nextLine();
		 
		 if(ev.contains(email)) {
			 System.out.println("Email ID is found : "+email);
		 }
		 else {
			 System.out.println("Email is not found : "+email);
		 }
		 
		 
	 }
}
