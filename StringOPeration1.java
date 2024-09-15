import java.util.Scanner;

public class StringOPeration1 {
    //Reverse the String
    public static void main(String[] args) {
        //case1 --> pwjava  to avajwp
        System.out.println("Enter any String to reverse :");
        Scanner scan=new Scanner(System.in);
        String str1= scan.nextLine();
        String str2="";
        for(int i=str1.length()-1;i>=0;i--){
            str2=str2+str1.charAt(i);
        }
        System.out.println("Reverse String : "+str2);
    }
}
