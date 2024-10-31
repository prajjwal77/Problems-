package Filehandling;

import java.io.File;
import java.io.IOException;

public class FilehandlingInJava {
	public static void main(String[] args) throws IOException {
		
//		File  file1=new File("pw.txt");
//		System.out.println(file1.exists());
//	
//		file1.createNewFile();
//		System.out.println(file1.exists());
		
		File  dirFile = new File("PW");
		System.out.println(dirFile.exists());
		
		dirFile.mkdir();//creating directory
		
		System.out.println(dirFile.exists());

	}
	
}
