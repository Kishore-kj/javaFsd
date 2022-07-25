package fileHandling;

import java.io.File;
import java.io.IOException;
public class fileCreation {

	public static void main(String[] args) {
		
		File myfile=new File("k:\\Data.txt");
		try {
			if(myfile.createNewFile())
			{
				System.out.println("File is Successfully Created");
			}
			else {
				System.out.println("File is not Successfully Created");
			}
		} catch (IOException e) {
			
			System.out.println("File is not Successfully Created");
		}
		
		
	}

}
