import java.util.Hashtable;
import java.util.Enumeration;

public class EnumerationHashTable {
    public static void main(String[] args){
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        hashtable.put("A", 1);
        hashtable.put("B", 2);
        hashtable.put("C", 3);
        hashtable.put("D", 4);
        hashtable.put("E", 5);
        //forward direction only, read operations only
        Enumeration<String> keys = hashtable.keys();

        while(keys.hasMoreElements()){
            String key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }
    }
}