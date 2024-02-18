import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Double> func1 = (a, b) -> Math.pow(a, b);
        Function<Double, String> func2 = (input) -> "The result is: " + String.valueOf(input);
        String result = func1.andThen(func2).apply(2, 4);
        System.out.println(result);
        
    }
}