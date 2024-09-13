import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //Binary Number....
        System.out.println("Enter only binary Number  To convert into Decimal :");
        String binary=scan.nextLine();
        //Convert to decimal....
        int decimal=Integer.parseInt(binary,2);
        System.out.println(binary+" ib binary = "+decimal+" in decimal");
    }
}
