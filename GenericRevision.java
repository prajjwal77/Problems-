import java.util.ArrayList;

public class GenericRevision {
    public static void main(String[] args) {
        ArrayList<String > al =new ArrayList<>();
        al.add("Prajjwal");
        al.add("Yadav");
        System.out.println(al);
        System.out.println(al.get(0));
        System.out.println(al.get(1));
        String name1=al.get(0);
        String name2=al.get(1);
        System.out.println(name1);
        System.out.println(name2);
    }
}
