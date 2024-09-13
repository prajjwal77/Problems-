import java.util.*;
import java.util.Collection;

public class HashMapCode {
    public static void main(String[] args) {
        HashMap hs=new HashMap();
        hs.put(2,"Virat");
        hs.put(3,"Rohit");
        hs.put(4,"Rahul");
        System.out.println(hs);
        LinkedHashMap hm=new LinkedHashMap();
        hm.put("Virat","Chiku");
        hm.put("Mahi","Dhoni");
        hm.put("Kl","Rahul");
        System.out.println(hm);
        System.out.println(hs.get(4));
       Set keySet = hs.keySet();
       Iterator it=keySet.iterator();
       while(it.hasNext()){
           System.out.println(it.next());
       }
       Collection values=hs.values();
       Iterator itt=values.iterator();
       while(itt.hasNext()){
           System.out.println(itt.next());
       }
     Set entrySet = hs.entrySet();
       Iterator ittt=entrySet.iterator();
       while(ittt.hasNext()){
           System.out.println(ittt.next());
       }
    }
}
