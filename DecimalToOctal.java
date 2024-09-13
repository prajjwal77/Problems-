import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter any Number to convert decimal to Octal :");
        int num=scan.nextInt();
        int decimalToOctal=convertDecimalToOctal(num);
        System.out.println(num + " in decimal = "+decimalToOctal+ " in octal .");
    }
    public  static  int convertDecimalToOctal(int num){
        int octalNumber=0,i=1;
        while(num!=0){
            octalNumber+=(num%8)*i;
            num=num/8;
            i *=10;
        }
        return octalNumber;
    }
}
