import java.util.Scanner;

public class DailyPracticeSet9 {
    public static void main(String[] args) {
        //Checking alphabets or not---------
        System.out.println("Enter any character to check alphabet or not : ");
        Scanner scan=new Scanner(System.in);
        char ch=scan.next().charAt(0);
        if  ((ch>='A'&& ch<='Z')||(ch>='a'&& ch<='z'))
        {
            System.out.println(ch +" is a character");
        }
        else {
            System.out.println(ch + " is not a character ");
        }


    }
}
