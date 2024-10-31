package Filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterAndFileWriter {

	public static void main(String[] args) throws IOException {
		File dir = new File("FileHandling");
		File file = new File(dir,"brfr.txt");
		//file.createNewFile();
		 FileWriter fw = new FileWriter(file);
		 BufferedWriter bw = new BufferedWriter(fw);
		 
		 bw.write("Java");
		 bw.newLine();
		 bw.write(65);
		 bw.newLine();
		 bw.write(97);
		 bw.newLine();
		 char ch[]= {'j','a','v','a'};
		 bw.write(ch);
		 
		 bw.flush();//recommended
		 //bw.close();  not recommended
	}
}
