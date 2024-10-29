package Filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingDataOntoFile {
//Writing data onto file using FileWriter
		public static void main(String[] args) throws IOException {
			
			File dir =new File("FileHandling");
			//dir.mkdir();
			
			File file = new File(dir,"file1.txt");
			
			FileWriter fw =new FileWriter(file);
			fw.write("Prajjwal");
			fw.write("\n");
			fw.write(99);
			fw.write("\n");
			fw.write(89);
			fw.write("\n");
			char c[]={'a','b','c','d','e'};
			fw.write(c);
			fw.write("\n");
			char ch[]={'j','a','v','a','p'};
			fw.write(ch);
			fw.write("\n");
			
			fw.close();
			System.out.println("open file1.txt to see result :");
		}
}
