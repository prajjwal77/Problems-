import java.util.Scanner;

public class DailyPracticeSet29 {
    public static void main(String[] args) {
        System.out.println("Enter the first interval :");
        Scanner scan=new Scanner(System.in);
        int low=scan.nextInt();
        System.out.println("Enter the last intervals : ");
        int high=scan.nextInt();
        while(low<high){
            boolean flag=false;
            for(int i=2;i<low;++i){
                if(low%i==0){
                  flag=true;
                  break;
                }
            }
            if(!flag && low != 0 && low !=1){
                System.out.print(low + " ");
            }
            low++;

        }
    }
}
