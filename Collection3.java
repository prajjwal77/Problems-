import java.util.LinkedList;

public class Collection3 {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.add(20);
        l1.add(30);
        l1.add(40);
        System.out.println(l1);
        LinkedList l2=new LinkedList();
        l2.add("PW SKILL");
        l2.add(1);
        l2.add('j');
        System.out.println(l2);
        LinkedList l3=new LinkedList();
        l3.add(1);
        l3.add(2);
        l3.add(3);
        System.out.println(l3);
        l3.add(2,40);
        System.out.println(l3);
        System.out.println(l3.peek());
        System.out.println(l3);
        System.out.println(l3.poll());
        System.out.println(l3);
    }
}
