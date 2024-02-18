import java.util.Arrays;
import java.util.Comparator;

//sort words by length
public class NewStyleStringLengthComparator {
        String[] words = {"hello", "world", "java", "python", "c++", "c#", "javascript"};
        public static void main(String[] args) {
        NewStyleStringLengthComparator nssc = new NewStyleStringLengthComparator();
        Arrays.sort(nssc.words, (s1, s2) -> s1.length() - s2.length());
        System.out.println("Sorted words: " + Arrays.toString(nssc.words));
    }
}
