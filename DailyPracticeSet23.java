import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class DailyPracticeSet23 {
    //Switch case Simple calculator
    public static void main(String[] args) {

        char operator;
        double num1, num2, result;
        Scanner scan = new Scanner(System.in);
        System.out.println(" choose an operator : +,*,-, or /");
        operator = scan.next().charAt(0);
        System.out.println("Enter first Number :");
        num1 = scan.nextInt();
        System.out.println("Enter second Number :");
        num2 = scan.nextInt();
        switch(operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}