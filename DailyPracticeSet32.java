import java.util.Scanner;

public class DailyPracticeSet32 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number to check  prime or not......");
        n= scanner.nextInt();
        boolean flag=false;
        for(int i=2;i<n;i++)
        {
            if(n%i==0){
                flag=true;
            }
        }
        if(flag==true){
            System.out.println("Not a Prime Number.....");
        }else {
            System.out.println("Prime Number.....");
        }
    }
}
