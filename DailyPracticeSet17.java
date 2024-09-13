import java.util.Scanner;

public class DailyPracticeSet17 {
    //Checking a number palindrome number  or not-------
    public static void main(String[] args) {
        int num;
        int remainder;
        int reversed=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any number to check Palindrome or not : ");
        num=scan.nextInt();
        int original=num;
        while(num!=0){
            remainder=num %10;
            reversed=reversed * 10 + remainder;
            num=num/10;
        }
    if(original==reversed){
        System.out.println("Palindrome Number ");
    }
    else {
        System.out.println("Not Palindrome Number ");
    }
    }

}
