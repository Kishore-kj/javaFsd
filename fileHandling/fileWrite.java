package fileHandling;

import java.io.FileWriter;
//import java.util.*;
public class fileWrite
{
	public static void main(String args[]) {
		String data= "1, kishore kumar, 1231, ECE, abc location, india.";
	
	
	try {
	FileWriter output= new FileWriter("k:\\Data.txt");
	output.write(data);
	System.out.println("File Written Successfully");
	output.close();
	}
	catch(Exception e)
	{
		System.out.println("Error File: "+ e);
	}
}
}