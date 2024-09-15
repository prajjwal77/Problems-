import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {


        int n = 100;
        while (n <= 200) {
            System.out.println(n);
            n++;
        }
        int i = 10;
        while (i > 0) {
            System.out.println(i);
            i--;
       }
            int x = 1;
            Scanner sc = new Scanner(System.in);
            int y = sc.nextInt();
            while (x != y) {
                System.out.println(x);
                x++;
            }
        }
    }