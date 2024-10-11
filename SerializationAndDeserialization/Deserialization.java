package SerializationAndDeserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Crickter1 implements Serializable{
	private String name;
	private int age ;
	private int run;
	public Crickter1(String name, int age, int run) {
		
		this.name = name;
		this.age = age;
		this.run = run;
	}
	@Override
	public String toString() {
		return "Crickter1 [name=" + name + ", age=" + age + ", run=" + run + "]";
	}
	public void disp() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(run);
	}
	
}
public class Deserialization {

	public static void main(String[] args) throws Exception {
//		Crickter1 crickter1=new Crickter1("Rohit", 39, 15000);
//		crickter1.disp();
		FileInputStream fis = new FileInputStream("pw.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Crickter1 cr=(Crickter1)ois.readObject();
		cr.disp();
		
		
		
	}
}
