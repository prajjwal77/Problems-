import java.util.Scanner;
public class DailyPracticeSet3 {
    public static void main(String[] args) {
        //Computing Quotient and Remainder
        System.out.println("Enter Dividend :");
      Scanner scan=new Scanner(System.in);
        int dividend=scan.nextInt();
        System.out.println("Enter Divisor : ");
        int divisor=scan.nextInt();
        int quotient =dividend/divisor;
        int remainder=dividend%divisor;
        System.out.println("Quotient = "+quotient);
        System.out.println("remainder = "+remainder);
    }
}
