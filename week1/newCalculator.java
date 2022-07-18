package week1;

import java.util.Scanner;
import java.lang.*;
import java.lang.Math;

public class newCalculator {

	public int add(int a, int b) {
		int ans = a + b ;
		return ans;
	}
	
	public int subtraction(int a,int b) {
		int ans = a -b;
		return ans;
	}
	
	public int multiply(int a, int b) {
		int ans = a*b;
		return ans;
	}
	
	public int division(int a,int b) {
		int ans = a/b;
		return ans;
	}
	
	public static void main(String[] args) {
		
	 int a;
	 int b;
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the numbers : ");
	 
	 a = sc.nextInt();
	 b = sc.nextInt();
	 
	 newCalculator obj = new newCalculator();
	 
	 int out = obj.add(a, b);
	 System.out.println("the addition of two numbers : "+out);
	 out = obj.subtraction(a, b);
	 System.out.println("the subtraction of two numbers : "+out);
	 out = obj.multiply(a, b);
	 System.out.println("the multiplication of two numbers : "+out);
	 out = obj.division(a, b);
	 System.out.println("the division of two numbers : "+out);
	 
	}
}
