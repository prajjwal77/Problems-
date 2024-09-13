import java.util.Scanner;

public class DailyPracticeSet16 {
    //Calculating the power of a numbers-----
    public static void main(String[] args) {
        int base,exponent;
        int result=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter base number :");
        base=scan.nextInt();
        System.out.println("Enter Exponent  of a number :");
        exponent=scan.nextInt();
        while (exponent!=0){
            result=result*base;
            --exponent;
        }
        System.out.println("Answer = "+result);
    }
}
