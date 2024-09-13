import java.util.Scanner;

public class DailyPracticeSet26 {
    //Finding factorial of number using recursion......
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number to find the factorial:");
        int number = scan.nextInt();
        int fact = factorial(number);
        System.out.println("Factorial = " + fact);
    }
    public static int factorial(int num){
        if(num==0){
            return num;
        } else if (num==1) {
            return  num;
        }
        else {
            return num*factorial(num-1);
        }
    }
}