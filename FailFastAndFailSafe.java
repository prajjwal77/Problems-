import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastAndFailSafe {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println(al);

        //fail fast...................
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        //fail safe....................
        CopyOnWriteArrayList  al1=new CopyOnWriteArrayList();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        System.out.println(al1);
        Iterator itr1=al1.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
            al1.add(100);
        }
    }
}
