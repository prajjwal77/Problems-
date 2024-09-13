import java.util.Scanner;

public class DailyPracticeSet19 {
    //Display Prime numbers b/w Two Interval----
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number to print prime number from starting  to :");
        int low=scan.nextInt();
        System.out.println("Enter the number to print prime number ending  :");
        int high=scan.nextInt();
        while (low<high){
            boolean flag=false;
            for(int i=2;i<=low/2;++i){
                //condition for non prime
                if(low % i == 0){
                    flag=true;
                    break;
                }
            }
            if(!flag && low!=0 && low!=1)
                System.out.print(low +" ");
            ++low;
        }
    }
}
