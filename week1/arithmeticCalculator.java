package week1;

import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.lang.Math;


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
			break;
			
		case '-' :
			c = a - b;
			break;
			
		case '*' :
			c = a * b;
			break;
		case '/' :
			c = a / b;
			break;
		case '%' :
			c = a % b;
			break;
		default :
			System.out.println("Wrong input");
		}
		
		System.out.println(a+" " +ch +" " +b+" = "+c);
	}
}
