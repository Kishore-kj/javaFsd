package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileRead {

	public static void main(String[] args) throws IOException {
		 char[] data=new char[100];
		 
		 try {
			FileReader input =new FileReader("k:\\Data.txt");
			input.read(data);
			System.out.println("Data is Read Successfully.");
			System.out.println(data);
		} catch (FileNotFoundException e) {
			
			System.out.println("Error in the Read File.");
		}

	}

}