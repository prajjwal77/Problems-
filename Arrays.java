import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        int[] Marks = {100, 200, 300, 400, 500};
        int len = Marks.length;
        System.out.println(len);
        for (int i = 0; i < Marks.length; i++) {
            System.out.println(Marks[i]);
        }
//    float[] marks={99.5f,89.5f,66.3f,55.4f,90.3f};
//       for(int j=0;j<marks.length;j++){
//           System.out.println(marks[j]);
//       }
//
//       String[] str={"Prajjwal","Rishi","Shubham","Vikash"};
//        System.out.println(str[3]);
//        System.out.println(str[1]);
        System.out.println("Reverse Array");
        for (int i = Marks.length - 1; i >= 0; i--) {
            System.out.println(Marks[i]);
        }
//Printing array element using for-each-loop
        System.out.println("Using for each loop");
        for (int element : Marks) {
            System.out.println(element);
        }
    }

}