import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any  string to check palindrome of not : ");
        String str1=scan.nextLine();
        String str2="";
        for(int i=str1.length()-1;i>=0;i--){
        str2=str2+str1.charAt(i);
        }
        if(str2.equals(str1)){
            System.out.println(" String ids palindrome.");
        }
        else {
            System.out.println(" String is not a palindrome .");
        }
    }
}
