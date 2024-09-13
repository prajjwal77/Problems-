import java.util.Scanner;

public class Codechef1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter X  :");
        int x=scan.nextInt();
        System.out.println("Enter Y :");
        int y=scan.nextInt();
        int floor1;
        int floor2;
        floor1=x/10;
        floor2=y/10;
        int i=0;
            while (floor1!=floor2) {
                floor1+=1;
                i++;
            }
        System.out.println(" the number of floors x need to travel to reach y's room "+ i + " Floors");
    }
}
