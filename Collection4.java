import java.security.spec.RSAOtherPrimeInfo;
import java.util.LinkedList;

public class Collection4 {
    public static void main(String[] args) {
        LinkedList ll1=new LinkedList();
        ll1.add(40);
        ll1.add(50);
        ll1.add(60);
        System.out.println(ll1);
        System.out.println(ll1.get(1));
        System.out.println(ll1.indexOf(50));
        System.out.println(ll1.lastIndexOf(60));
        System.out.println(ll1.getFirst());
        System.out.println(ll1.getLast());

    }
}
