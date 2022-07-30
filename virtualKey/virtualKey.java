package virtualKey;

import java.util.Scanner;
import java.io.IOException;

public class virtualKey {

	public static void main(String[] args) {
		
		int fop= 0,sop =0;
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("Enter the operation to be performed");
		System.out.println("***********************************");
		
	    System.out.println("1. List of file names");
	    System.out.println("2. Business Level Operation Menu");
	    System.out.println("3. Exit form the Application");
	    
	    try {
	    	fop = sc.nextInt();
			
		} catch (Exception e) {
			System.out.println("Null Exception occurred");  
		}
	    
	    switch(fop) {
	    case 1:
	    	businessClass.listFiles();
	    	break;
	    case 2:
	    	Boolean temp = true;
	    	while(temp) {
	    	System.out.println("Please choose one of the following options :");
	    	System.out.println("******************************************");
			System.out.println("1. Add a File");
			System.out.println("2. Delete a File");
			System.out.println("3. Search for a File");
			System.out.println("4. Back to main menu");
			System.out.println("5. Exit application");
			
			try {
				sop = sc.nextInt();
				
			} catch (Exception e) {
				System.out.println("Null Exception occurred");
			}
	        
			switch(sop) {
			
			case 1:
				System.out.println("Enter the name of the filr to be created ");
				String fileName = sc.next();
				
				businessClass.createFile(fileName);
				break;
			
			case 2:
				System.out.println("Enter the name of the file to be deleted");
				String fileDelete = sc.next();
				
				businessClass.deleteFile(fileDelete);
				break;
			case 3:
				System.out.println("Enter the name of the file to be searched");
				String fileSearch = sc.next();
				
				businessClass.searchFile(fileSearch);
				break;
			case 4:
				temp = false;
				break;
			case 5:
				sc.close();
				System.out.println("\n Application exited");
				System.exit(1);
				break;
			default:
				System.out.println("\n Invalid Input,Re-do the process\n");
				break;
			}
			}
			break;
	    case 3:
	    	sc.close();
			System.out.println("\n Application exited");
			System.exit(1);
			break;
		default :
			System.out.println("\n Invalid Input,Re-do the process\n");
			break;
			
	   
	    }
	    
	    
		}
	    
	}
}
