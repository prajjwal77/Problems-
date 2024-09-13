import java.util.Scanner;

public class DailyPracticeSet20 {
    //Armstrong Number b/w two given intervals
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first interval to print armstrong number :");
        int low=scan.nextInt();
        System.out.println("Enter the second interval to print armstrong number :");
        int high=scan.nextInt();
        for(int number=low+1;number<high;++number){
            int digit=0;
            int result=0;
            int originalNumber=number;
            //number of digits calculation
            while (originalNumber!=0){
                originalNumber=originalNumber/10;
                ++digit;
            }
            originalNumber=number;
            while (originalNumber!=0){
                int remainder =originalNumber%10;
                result+=Math.pow(remainder,digit);
                originalNumber/=10;
            }
            if(result==number){
                System.out.println(number + " ");
            }
        }
    }
}

