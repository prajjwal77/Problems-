package Filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingDataFromFile {
	//Reading data from file to Java using FileReader
	public static void main(String[] args) throws IOException {
		
		File dir = new File("FileHandling");
		File file =new File(dir,"file1.txt");
		
		FileReader fReader = new FileReader(file);
//		int i = fReader.read();
//		while(i!=-1) {
//			System.out.println(i+"-------->"+(char)i);
//			i=fReader.read();
//		}
		char ch[]= new char[(int)file.length()];
		fReader.read(ch);
		for(char data : ch) {
			System.out.print(data);
		}
	}  
}
