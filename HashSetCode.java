import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetCode {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add(100);
        hs.add(20);
        hs.add(40);
        System.out.println(hs);
        LinkedHashSet lhs1=new LinkedHashSet();
        lhs1.add(100);
        lhs1.add(20);
        lhs1.add(30);
        lhs1.add(40);
        System.out.println(lhs1);
    }
}
