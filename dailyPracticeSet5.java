import java.util.Scanner;
public class dailyPracticeSet5 {
    public static void main(String[] args) {
        System.out.println("Enter three number to find largest num ");
        Scanner scan=new Scanner(System.in);
        int x,y,z;
        x=scan.nextInt();
        y=scan.nextInt();
        z=scan.nextInt();
        if(x>y&&x>z){
            System.out.println(x+" is Largest");
        }
        else if (y>x&&y>z) {
            System.out.println(y+" is Largest");
        }
        else {
            System.out.println(z+" is Largest");
        }
    }
}
