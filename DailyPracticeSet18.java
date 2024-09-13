import java.util.Scanner;

public class DailyPracticeSet18 {
    //Check whether prime or not-------
    public static void main(String[] args) {
        int num;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any number to check prime or not ");
        num=scan.nextInt();
        boolean flag =false;
        for(int i=2;i<num;i++)
        {
            if(num%i==0){
                flag =true;
            }
        }
        if(!flag){
            System.out.println(num + " is a Prime Number");
        }
        else {
            System.out.println(num +" is not Prime Number ");
        }
    }
}
