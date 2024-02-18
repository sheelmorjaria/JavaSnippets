import java.util.HashMap;


public class HashMapKeySet {
    public static void main(String[] args){
        HashMap<String, Integer> numbers = new HashMap<>();
        //add values
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);

        System.out.println("HashMap: " + numbers);

        System.out.println("Keys: ");

        for(String key : numbers.keySet())
            System.out.println(key + ", ");
    }
}