import java.util.Hashtable;
import java.util.Map;

public class IteratingHashTable {
    public static void main(String[] args){
        Hashtable<String,Integer> ht = new Hashtable<>();

        ht.put("Danny",10);
        ht.put("John", 30);
        ht.put("laura", 20);
        //iterate utilising enhanced for loop
        for(Map.Entry<String, Integer> e :ht.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}