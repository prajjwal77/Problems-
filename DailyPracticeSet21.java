import java.util.Scanner;

public class DailyPracticeSet21 {
    //Display prime number b/w given intervals
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first interval to print prime number :");
        int firstNum=scan.nextInt();
        System.out.println("Enter second intervals to print prime number :");
        int secondNum=scan.nextInt();
        while (firstNum<secondNum){
            if(checkPrimeNumber(firstNum))
                System.out.print(firstNum +" ");
            ++firstNum;
        }
    }

    private static boolean checkPrimeNumber(int num) {
        boolean flag = true;
        for (int i = 2; i <= (num / 2); ++ i) {
            if (num % i == 0) {
                flag = false;
                break;
            }

        }

        return flag;
    }
}
