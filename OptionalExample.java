import java.util.Optional;
//avoid NullPointerException
public class OptionalExample {
    public static void main(String[] args) {
        String[] words = {"hello", "world", "java", "python", "c++", "javascript", null};
        Optional<String> checkNull = Optional.ofNullable(words[6]);
        checkNull.ifPresentOrElse(
            word-> System.out.println(word.toLowerCase()),
            () -> System.out.println("word is null")
        );
    }
}