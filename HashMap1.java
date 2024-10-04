
import java.util.HashMap;
import java.util.*;


public class HashMap1 {
    public static <AttributeEntry> void main(String[] args) {
        HashMap<Integer,String> hashmap = new HashMap<>();
        hashmap.put(1,"Prajjwal");
        hashmap.put(4,"Navneet");
        hashmap.put(7,"Kisan");
        hashmap.put(3,"Map");
        System.out.println("Hashmap of the given data is : "+hashmap);
        //get function .........
        String result=hashmap.get(5);
        System.out.println("value of given key is : "+result);
        //functionality of the containsKey() function
        System.out.println(hashmap.containsKey(7));//output is true or false
        //functionality of the remove function
        hashmap.remove(1);
        System.out.println("Updates hashmap :"+hashmap);
        //iterating using the for loop

        for(map.Entry<Integer,String>e.hashmap.entrySet()){
            System.out.println("Hashmap is : "+e.getKey()+":"+e.getValue());
        }

    }
}
