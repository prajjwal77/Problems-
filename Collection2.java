import java.util.ArrayList;

public class Collection2 {
    public static void main(String[] args) {
            ArrayList al1=new ArrayList();
            al1.add(10);
            al1.add(20);
            al1.add(30);
            System.out.println(al1);
            System.out.println(al1.contains(20));
            int index=al1.indexOf(20);
            System.out.println(index);
            al1.ensureCapacity(10);
            al1.trimToSize();
            System.out.println(al1.size());
            al1.clear();
            System.out.println(al1);


    }
}
