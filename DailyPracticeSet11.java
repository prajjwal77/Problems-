import java.util.Scanner;

public class DailyPracticeSet11 {
    //print th fibonacci series-------
    public static void main(String[] args) {
        int n;
        int firstTerm=0,secondTerm=1;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter any Number to print fibonacci series : ");
        n=scan.nextInt();
        System.out.println("Fibonacci series till the " +n+ " terms :");
        for(int i=1;i<=n;i++){
            System.out.print(firstTerm + ", ");
            //compute the next term
            int nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }
    }
}
