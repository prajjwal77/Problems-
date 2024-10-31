package Filehandling;

import java.io.File;
import java.io.IOException;

public class MoreOnFileHandling {
public static void main(String[] args) throws IOException {
	File dirFile = new File("PwJava");
//	System.out.println(dirFile.exists());
	dirFile.mkdir();
	System.out.println(dirFile.isDirectory());
	
//	File file = new File(dirFile, "pwSkills.txt");
//	file.createNewFile();
//	System.out.println("FIle is Refering to pwskills.txt : "+file.isFile());
//	
	int count =0;
	File file2=new File("PwJava");
	File f = new File(dirFile,"IO.txt");
	f.createNewFile();
	 String[]  string =file2.list();
	 
	 for(String str : string) {
		 count++;
		 System.out.println(str);
	 }
	 System.out.println("No. of files are : "+count);
}
}
