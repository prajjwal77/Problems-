 import java.util.Scanner;
public class ProblemSolving2 {
    public static void main(String[] args) {
        // 1.Write a program to convert a string to lowercase.
        String name="Varanasi";
        String lname=name.toLowerCase(); //coverting string to lower case
        System.out.println(lname);

        //2. Write  a program to replace space with underscores
        String str="Hello Prajjwal ";
        System.out.println(str.replace(' ','_'));

        //3. Write a program to fill in a letter template which looks like below
        //letter ="Dear <!name!>,Thanks a lot"
        //Replace <!name!> with a string (some name)
        String letter="Dear name ,Thanks a lot!";
        letter=letter.replace("name","Prajjwal");
        System.out.println(letter);

        //4. Write a program to detect double and triple spaces in a string
        String str2="The double and triple  contains  spaces";
        System.out.println(str2.indexOf("  "));
        System.out.println(str2.indexOf("   "));

        //5. Write a program to formate the following  letter using escape Sequence character
        //letter ="Dear Prajjwal,This java Course in Nice ,Thanks"
        String str3="Dear Prajjwal, \nThis java Course is Nice,\nThanks";
        System.out.println(str3);
    }
}
