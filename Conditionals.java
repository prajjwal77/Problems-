import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("ENter your age to check you are eligible to vote :");
        int age=sc.nextInt();
        if(age>18)
        {
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("Yu are note eligible to vote");
        }
    }
}
