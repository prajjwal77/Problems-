import java.util.Locale;
import java.util.Scanner;
public class StringsMethods {
    public static void main(String[] args) {
        String name="Prajjwal";
        System.out.println(name);
        //----------------1st method------------------------------
        int value=name.length();   //returns the length of strings
        System.out.println("Length of Strings is="+value);
        //----------------2nd method----------------------------
        String lstring=name.toLowerCase();  //Return lower case character
        System.out.println(lstring);
        //---------------------3rd method----------------------
        String  ustring=name.toUpperCase(); //Return Upper case character
        System.out.println(ustring);
        //------------------4rth Method-------------------------
        String NonTrimmedString="     Navneet        ";
        System.out.println("Non Trimmed Strings="+NonTrimmedString);
        String TrimmedString=NonTrimmedString.trim(); //Return a new string after removing all leading and traling spqaces
        System.out.println("Trimmed Strings ="+TrimmedString);
        //----------------5fth String--------------------------
        System.out.println(name.substring(1)); //return Substring from start to the end
        //---------------6th method---------------------------
        System.out.println(name.substring(1,4)); //return a substrings from start index  to end
        //--------------------7th Method-----------------------
        System.out.println(name.replace('r','p')); //Return a new string after replacing r with p
        //--------------------8th Method-----------------------
        System.out.println(name.startsWith("Pr")); //Return true if start with "Pr" .else return -1
        //---------------------9th Method-----------------------
        System.out.println(name.endsWith("al")); //return True if end with "al".else return -1
        //---------------------10th Method----------------------
        System.out.println(name.charAt(4)); //Return a character at a given index  position
        //---------------------11th Method-------------------------
        System.out.println(name.lastIndexOf("j")); //Return the last occurance of given string
        //----------------------12th Method------------------------
        System.out.println(name.indexOf("a",2)); //Return the last index of given index before 2
        //-----------------13th--------------------------------
        System.out.println(name.lastIndexOf("a"));
        //-------------------14th--------------------------
        System.out.println(name.lastIndexOf("a",2));
        //--------------------15th------------------------
        System.out.println(name.equals("Prajjwal"));
        //------------------16th-----------------------------
        System.out.println(name.equalsIgnoreCase("prajjWal"));


    }
}
