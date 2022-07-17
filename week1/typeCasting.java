package week1;

import java.util.Scanner;

public class typeCasting {
 
public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		char ch;
		System.out.println("Enter the character for implicit typecasting");
		
		ch = sc.next().charAt(0);
		
        System.out.println("Enter the double value for explicit typecasting");
		
		double db = sc.nextDouble();
		
		System.out.println("Implicit type casting :- ");
		System.out.println("--------------------- ");
		System.out.println("The value of character : "+ch);
		
		int a = ch;
		System.out.println("The value of integer   : "+a);
		
		float b = ch;
		System.out.println("The value of float     : "+b);
		
		long c = ch;
		System.out.println("The value of long      : "+c);
		
		double d = ch;
		System.out.println("The value of double    : "+d);
		
		
		
		System.out.println("\nExplicit type casting :-");
		System.out.println("---------------------");
		
		int e = (int)db;
		System.out.println("the value of double  : "+db);
		System.out.println("the value of integer : "+e);
		
		float f = (float)db;
		System.out.println("the value of Float   : "+f);
		
		
	}
}
