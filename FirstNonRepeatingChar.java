import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String :");
        String str=sc.nextLine();
        HashMap<Character,Integer>map=new HashMap<>();
        //construction of hashmap
        //Key - unique character in the string
        //value - frequency of each character in the string
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i),1);
            }
        }
        //scan the entire hashtable and get non-repeating cha
        int result=-1;
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                System.out.println("The first non repeating char index is : "+i);
                result=1;
                break;
            }
        }
        if(result==-1){
            System.out.println("No NON - REPEATING CHAR PRESENT : ");
        }
    }
}
