import java.util.Scanner;
public class DailyPracticeSet4 {
//Checking Even Or Odd
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
        System.out.print("Enter any number to check Even or Odd :");
  int n=scan.nextInt();
  if(n%2==0){
      System.out.println("Even Number!");
  }
  else{
      System.out.println("Odd Number !");
  }
    }
}
