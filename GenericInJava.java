import java.util.ArrayList;

public class GenericInJava {
    public static void main(String[] args) {
        ArrayList<String> al;
        al = new ArrayList<String>();
        al.add("Prajjwal yadav");
        al.add("Navneet yadav");
        String name1=al.get(0);
        String name2=al.get(1);
        System.out.println(name1);
        System.out.println(name2);
    }
}
