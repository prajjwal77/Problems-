import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any Decimal Number To Convert into Binary :");
        int decimal=scan.nextInt();
        int dToB=decimalToBinary(decimal);
        System.out.println("\n"+ decimal +" = "+ dToB);
    }
    public static int decimalToBinary(int num){
        int bNumber=0;
        int remainder,i=1,step=2;
        while (num!=0){
            remainder=num%2;
            num/=2;
            bNumber+=remainder*i;
            i *= 10;
        }
        return bNumber;
    }
}
