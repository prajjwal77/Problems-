package AnnotationsInJava;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer{
	String country() default"India";
	int age() default 34;
}
@CricketPlayer
class Virat{
	private int innings;
	private int runs;
	public int getInnings() {
		return innings;
	}
	public void setInnings(int innings) {
		this.innings = innings;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
}
public class Annotations1 {
	public static void main(String[] args) {
		Virat v1 = new Virat();
		v1.setInnings(300);
		v1.setRuns(20000);
		
		System.out.println(v1.getInnings());
		System.out.println(v1.getRuns());
		
		Class c=v1.getClass();
		Annotation annotations1 =c.getAnnotation(CricketPlayer.class);
		CricketPlayer cPlayer= (CricketPlayer)annotations1;
		
		String country = cPlayer.country();
		System.out.println(country);
		int age =cPlayer.age();
		System.out.println(age);
		
	}

}
