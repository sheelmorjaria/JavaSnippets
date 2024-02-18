import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsList {    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Shoes");
        list.add("Toys");

        Collections.addAll(list, "Socks", "Shirt", "Pants");

        Collections.sort(list);

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }

        System.out.println();

        Collections.sort(list, Collections.reverseOrder());

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
    }
}
