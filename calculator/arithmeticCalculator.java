package calculator;

import java.util.Scanner;

public class arithmeticCalculator {

public static void main(String[] args) {
		
		System.out.println("Arithmetic Calculator");
		System.out.println("---------------------");
		
		double a;
		double b;
		double c = 0;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		System.out.println("Enter the any operation to calculate : + | - | * | / | %");
		
		ch = sc.next().charAt(0);
		
		switch(ch) {
		
		case '+' :
			c = a + b;
			System.out.println(a+" " +ch +" " +b+" = "+c);
			break;
			
		case '-' :
			c = a - b;
			System.out.println(a+" " +ch +" " +b+" = "+c);
			break;
			
		case '*' :
			c = a * b;
			System.out.println(a+" " +ch +" " +b+" = "+c);
			break;
		case '/' :
			c = a / b;
			System.out.println(a+" " +ch +" " +b+" = "+c);
			break;
		case '%' :
			c = a % b;
			System.out.println(a+" " +ch +" " +b+" = "+c);
			break;
		default :
			System.out.println("Wrong input");
			
		}
		
	}
}
