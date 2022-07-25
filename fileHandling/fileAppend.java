package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class fileAppend {

	public static void main(String[] args) {
		String data="The new Text is appended to the following .txt folder";
		
		try {
			FileWriter output=new FileWriter("k:\\data.txt",true);
			output.write(data);
			System.out.println("File is Appended Successfully.");
			output.close();
		} catch (IOException e) {
			System.out.println("File Append Failed");
		}

	}
}