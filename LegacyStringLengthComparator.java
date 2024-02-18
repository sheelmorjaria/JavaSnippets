import java.util.Comparator;
public class LegacyStringLengthComparator implements Comparator{
    private LegacyStringLengthComparator() {
    }
    public static final LegacyStringLengthComparator INSTANCE = new LegacyStringLengthComparator();
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        return s1.length() - s2.length();
    }
    public static void main(String[] args) {
        LegacyStringLengthComparator slc = LegacyStringLengthComparator.INSTANCE;
        System.out.println(slc.compare("hello", "world"));
    }
}