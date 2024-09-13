import java.util.Scanner;

public class DailyPracticeSet1 {
    public static void main(String[] args) {

        // 1......Reading a number from the Standard input
//        int num;
//        Scanner scan=new Scanner(System.in);
//        num=scan.nextInt();
//        System.out.println("Entered Num :"+num);
        Scanner scan=new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter any two Number to swap");
        System.out.println("Enter your first value a : ");
        x=scan.nextInt();
        System.out.println("Enter your Second value y : ");
        y=scan.nextInt();
        System.out.printf("Before Swapping x=%d and y=%d\n",x,y);
        z=x;
        x=y;
        y=z;
        System.out.printf("After Swapping x=%d and y=%d ",x,y);
    }
}
