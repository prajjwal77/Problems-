import java.util.Scanner;
public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("ENter your age :");
        Scanner sc=new Scanner(System.in);
int age=sc.nextInt();
    if(age>18)
    {
        System.out.println("You are Adult");
    }
    else if(age>35)
    {
        System.out.println("Your are a Senior Citizen");
    }
    else{
        System.out.println("Your are a Teenager");
    }

    }
}
