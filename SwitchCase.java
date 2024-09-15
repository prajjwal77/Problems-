import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        switch (age) {
            case 1 -> System.out.println("You are going to become adult");
            case 2 -> System.out.println("You are going to join job");
            case 3 -> System.out.println("You are going to retaired");
            default -> System.out.println("Enjoy your life");
        }
    }
}
