import java.util.List;
import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args){
        String arr[] = new String[]{"Java", "Python", "C++", "C#", "JavaScript"};

        List<String> list = Arrays.asList(arr);

        System.out.println("List: " + list);
    }
}

