import java.util.Scanner;

public class DailyPracticeSet27 {
    //Binary to decimal conversing using custom method.......
    public static void main(String[] args) {
        //binary number
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Binary Number :");
        long num=scan.nextLong();
        int decimal=conversionBinaryToDecimal(num);
        System.out.println("Binary to Decimal ");
        System.out.println(num+ " in binary = "+decimal+" in decimal");

    }
     public static int conversionBinaryToDecimal(long num){
        int decimalNumber=0;
        int i=0;
        long remainder;
        while(num!=0){
            remainder=num%10;
            num/=10;
            decimalNumber+=remainder*Math.pow(2,i);
            ++i;
        }
        return decimalNumber;
    }
}
