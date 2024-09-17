import java.util.LinkedList;
public class AddElementToLinkedList {

    public static void main(String[] args) {
        LinkedList<String> l1=new LinkedList<>();
        l1.add("Prajjwal");
        l1.add("yadav");
        System.out.println("LinkedList :"+l1);
        l1.add(0,"Name");
        System.out.println("After adding at 0 index:"+l1);

    }
}
