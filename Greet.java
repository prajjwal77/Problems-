import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        System.out.println("Enter your Name:");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("Hello! "+name+" HAve a Good Day");

    }
}
