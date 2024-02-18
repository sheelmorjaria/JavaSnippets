//singleton class maintains a single instance of the class and returns that instance from the static getInstance method
public class SingletonExample {
   private static SingletonExample instance = null;
    private SingletonExample() {
    }
    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }
}