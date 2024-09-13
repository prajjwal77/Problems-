import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
//...................ITERATOR AND LISTITERATOR  IN JAVA...............................
public class Iterators {
    public static void main(String[] args){
        ArrayList al= new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println(al);
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }
        System.out.println();
        ListIterator litr=al.listIterator(al.size());
        while(litr.hasPrevious()){
            System.out.print(litr.previous());
        }
    }
}
