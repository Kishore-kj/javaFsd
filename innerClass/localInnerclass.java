package innerClass;
import java.util.Scanner;
public class localInnerclass {

	void check(String key) {
		
		if(key.equals("kishorekumar@gmail.com")) {
			
			class inner{
				void validate() {
					 System.out.println("Email is found");
				}
			}
			inner obj1 = new inner();
			obj1.validate();
		}
		else{
			System.out.println("EMail Id not found");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		localInnerclass obj = new localInnerclass();
		System.out.println("Enter the mail to search");
		String key = sc.nextLine();
		
		obj.check(key);
	}
}
