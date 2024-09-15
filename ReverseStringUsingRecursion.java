import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class ReverseStringUsingRecursion {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Any String To Print Reverse : ");
        String str =scan.nextLine();
        String reversed=reverse(str);
        System.out.println("Reversed String : "+reversed);
    }
    public static  String reverse(String sentence){
        if(sentence.isEmpty()){
            return sentence;
        }else{
            return reverse(sentence.substring(1))+sentence.charAt(0);
        }
    }
}
