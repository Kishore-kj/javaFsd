package virtualKey;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class businessClass {

	protected static String[] sort_sub(String array[], int size){
		String temp = "";
		for(int i=0; i<size; i++){
			for(int j=1; j<(size-i); j++){
				if(array[j-1].compareToIgnoreCase(array[j])>0){
					temp = array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}
	protected static void listFiles() {
		int fileCount = 0;
	    ArrayList<String> filenames = new ArrayList<String>();
	
		File directoryPath = new File(System.getProperty("user.dir"));
		File[] listOfFiles = directoryPath.listFiles();
		fileCount = listOfFiles.length;
		
		
		System.out.println("Files in ascending order: ");
		for (int i = 0; i < fileCount; i++) {
		  if (listOfFiles[i].isFile()) {
		    filenames.add(listOfFiles[i].getName());
		  } 
		}
		
		String[] str = new String[filenames.size()];
		 
	    for (int i = 0; i < filenames.size(); i++) {
	        str[i] = filenames.get(i);
	    }
		
	    String[] sorted_filenames = sort_sub(str, str.length);
		
		for(String currentFile: sorted_filenames) {
			System.out.println(currentFile);
		}

	}
	
protected static void createFile(String fileCreate) {
	File file = new File( (System.getProperty("user.dir") ) + "\\" + fileCreate );
	
	try {
		if (file.createNewFile() ) {
			System.out.println("File Created!");
		} else {
			System.out.println("File already exists :(");
		}
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	}

protected static void deleteFile(String fileDelete) {
	File file = new File( (System.getProperty("user.dir") ) + "\\" + fileDelete );
	
	if(file.exists()) {
		if ( file.delete() ) {
			System.out.println("File deleted successfully!");
		}
	} else {
		System.out.println("File Not Found");
	}
}
protected static void searchFile(String fileSearch) {
	File file = new File( (System.getProperty("user.dir") ) + "\\" + fileSearch );
	
	
	if(file.exists()) {
		System.out.println("File found");
	} else {
		System.out.println("file not found");
	}	
	PrintWriter pw;  
    try {  
        pw = new PrintWriter(fileSearch);    
        pw.println("saved");  
    }  
     
    catch (FileNotFoundException e) {  
          
        System.out.println(e);  
    } 
}
}
