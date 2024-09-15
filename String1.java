import com.sun.security.jgss.GSSUtil;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
      int [] arr={70,55,89,34,22};
      Arrays.sort(arr);
      int n=arr.length;
        System.out.println("Second largest Element in array  :"+arr[n-2]);
    }
}