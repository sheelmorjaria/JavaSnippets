public class GenericMethod {
    //generic print method
    public static <E> void printArray(E[] elements) {
        for (E element : elements) {

            System.out.printf("%s ", element); 
        }
    }
    public static void main(String[] args){
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'C','O','D','E','R'};

        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);

    }
}