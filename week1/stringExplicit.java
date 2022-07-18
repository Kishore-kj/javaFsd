package week1;
import java.util.Scanner;
public class stringExplicit {
	
	public static void main(String[] args) {
		String kj;
		
		Scanner sc = new Scanner(System.in);
		
		kj = sc.nextLine();
		
		byte e = Byte.parseByte(kj);
		System.out.println(e);
		
		short f = Short.parseShort(kj);
		System.out.println(f);
		
		int a = Integer.parseInt(kj);
		System.out.println(a);
		
		float b = Float.parseFloat(kj);
		System.out.println(b);
		
		double c = Double.parseDouble(kj);
		System.out.println(c);
		
		long d = Long.parseLong(kj);
		System.out.println(d);
		
	}
	
}
