// Description: This program demonstrates the use of generic class in Java.
public class GenericClass{
    public  static class Box<T> {
        private T t;
        public void add(T t) {
            this.t = t;
        }
        public T get() {
            return t;
        }
        
    }

    public static void main(String[] args){
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World!"));

        System.out.printf("Integer value : %d\n", integerBox.get());
        System.out.printf("String value : %s\n", stringBox.get());
    }
}