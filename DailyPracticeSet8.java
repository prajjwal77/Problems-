import java.util.Scanner;

public class DailyPracticeSet8{
    //Checking positive or negative integer number
    public static void main(String[] args) {
        System.out.println("Enter any Number to check +ive or -ive number : ");
        Scanner scan=new Scanner(System.in);
        double n=scan.nextDouble();
        if(n<0.0){
            System.out.println(n + " is a negative  number ");
        }
        else if(n>0.0){
            System.out.println(n +"  is a positive number ");
        }
        else {
            System.out.println(n +" is zero");
        }
    }
}
