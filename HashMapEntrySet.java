import java.util.HashMap;

public class HashMapEntrySet {
    public static void main(String[] args){
        HashMap<String, Integer> prices = new HashMap<>();
        //add values
        prices.put("Shoes", 250);
        prices.put("Bag", 300);
        prices.put("Scarf", 150);
        System.out.println("HashMap: " + prices);
        //set view of key value pairs
        System.out.println("Set view: " + prices.entrySet());
    }
}