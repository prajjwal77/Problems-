import java.util.Scanner;

public class DailyPracticeSet22 {
    //factor of positive Integer
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any number to find the factor ;");
        int num=scan.nextInt();
        System.out.print("Factor of "+num+" are :");
        for(int i=1;i<=num;i++)
        {
            if(num % i ==0){
                System.out.print( i +" ");
            }
        }
    }
}
