import java.util.Scanner;

public class DailyPracticeSet25 {
    //Sum of Natural Number using Recursion.......
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any Number to print their sum :");
        int number =scan.nextInt();
        int sum=addNumber(number);
        System.out.println(" Sum = "+sum);
    }

    public static int addNumber(int num) {
        if(num!=0){
            return num + addNumber(num-1);
        }
        else
            return  num;
    }
}
