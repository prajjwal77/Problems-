package Filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWritter {
	public static void main(String[] args) throws IOException {
		File dir =new File("PW");
		File file =new File(dir, "pw.txt");
		
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println(100);
		pw.println('a');
		pw.println(50.5);
		pw.println("java");
		pw.close();
		
		FileReader fReader = new FileReader(file);

		char ch[]= new char[(int)file.length()];
		fReader.read(ch);
		for(char data : ch) {
			System.out.print(data);
		}
	}
}
