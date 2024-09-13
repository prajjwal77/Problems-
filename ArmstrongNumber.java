import java.sql.PreparedStatement;
import java.util.Scanner;

public class ArmstrongNumber {
    //Logic of Armstrong number
    //153=1*1*1 + 5*5*5 + 3*3*3 = 153
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number to check Armstrong number or not :");
        int num =scan.nextInt();
        int result=0;
        int originalNumber=num;
        while(num!=0){
            int remainder =num%10;
            result+=Math.pow(remainder,3);
          //  result= result + remainder*remainder*remainder;
            num = num / 10;
        }
        if(result==originalNumber){
            System.out.println(originalNumber + " is an Armstrong number ");
        }
        else {
            System.out.println(originalNumber + " is not an Armstrong number ");
        }
    }
}
