import java.util.LinkedList;
public class AccessTheELementLL {
    public static void main(String[] args) {
       LinkedList<String> ll1=new LinkedList<>();
       ll1.add("Hello");
       ll1.add("My");
       ll1.add("Prajjwal");
       System.out.println("Linked List :"+ll1);
        String s = ll1.get(2);
        System.out.println("element at :"+s);
    }
}
