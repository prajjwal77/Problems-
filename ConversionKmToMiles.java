import java.util.Scanner;
public class ConversionKmToMiles {
    public static void main(String[] args) {
        System.out.println("ENter Kilometer to Convert into miles:");
        Scanner sc=new Scanner(System.in);
        float m=0.621f;
        float n=sc.nextFloat();
        float conversion=n*m;
        System.out.println("="+conversion+"Miles");
    }
}
