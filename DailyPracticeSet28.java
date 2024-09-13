import java.util.Scanner;

public class DailyPracticeSet28 {
    //Average of arrays-------->
    public static void main(String[] args) {
        System.out.println("Enter Size of array: ");
        Scanner scan=new Scanner(System.in);
        double sum=0.0;
        double avg=0.0;
        double n=scan.nextDouble();
        double [] arr=new double[20];
        for(int i=1;i<=n;i++){
            System.out.printf("Enter element %d :",i);
            arr[i]=scan.nextDouble();
        }
        for(double element:arr){
            sum+=element;
        }
        avg=sum/n;
        System.out.println("Average of input array is : "+avg);
    }
}
