import java.util.Scanner;

public class DailyPracticeSet10 {
    //Sum of n natural number--------
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any natural Number to add the n number of times : ");
        int sum=0;
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("Sum of  natural numbers :"+sum);
    }
}
