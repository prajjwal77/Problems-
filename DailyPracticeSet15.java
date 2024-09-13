import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class DailyPracticeSet15 {
    // Reverse a number ---------
    public static void main(String[] args) {
        int num;
        int reversed =0;
        System.out.println("Enter any number to print in reverse order :");
        Scanner scan=new Scanner(System.in);
        num=scan.nextInt();
        System.out.println("Original Number = " +num);
        while(num!=0){
            int remainder =num%10;
          reversed=reversed* 10 + remainder;
            num=num/10;
        }
        System.out.println("Reversed Number : "+reversed);

    }
}
