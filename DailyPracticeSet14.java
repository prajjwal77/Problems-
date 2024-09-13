import java.util.Scanner;

public class DailyPracticeSet14 {
    //Count the Number of integers-------
    public static void main(String[] args) {
        int num, count = 0;
        System.out.println("Enter  any number of digit  to count : ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        while (num != 0) {
            num = num / 10;
            ++ count;
        }
        System.out.println("Number of Digit : " + count);

    }
}
