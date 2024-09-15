import javax.imageio.stream.ImageInputStream;
import java.math.BigInteger;
import java.util.Scanner;
public class Recursion {
//        static long factorial(long n) {
//            if (n == 0 || n == 1) {
//                return 1;
//            } else {
//                return n = n *factorial(n - 1);
//            }
//        }
static BigInteger factorial(int n) {
    if (n == 0 || n == 1) {
        return BigInteger.ONE;
    } else {
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }
}
    public static void main(String[] args) {
        int x=60;
        System.out.println(factorial(x));
    }
}
