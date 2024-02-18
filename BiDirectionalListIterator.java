import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class BiDirectionalListIterator{
    public static void main(String[] args){
        List<String> names = new LinkedList<>();
        names.add("John");
        names.add("David");
        names.add("Peter");
    
        //Bidirectional with read, remove, add and remove operations
        ListIterator<String> listIterator = names.listIterator();

        System.out.println("Forward Direction:");
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("Backward Direction:");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
