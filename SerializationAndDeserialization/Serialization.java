package SerializationAndDeserialization;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Crickter implements Serializable{
	private String name;
	private int age ;
	private int run;
	public Crickter(String name, int age, int run) {
		
		this.name = name;
		this.age = age;
		this.run = run;
	}
	@Override
	public String toString() {
		return "Crickter [name=" + name + ", age=" + age + ", run=" + run + "]";
	}
	
	
}
public class Serialization {
	public static void main(String[] args) throws IOException {
		Crickter crickter = new Crickter("Virat",34, 20000);
		
		FileOutputStream fos = new FileOutputStream("pw.txt");
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(crickter);
		oos.flush();
		oos.close();
	}
}
