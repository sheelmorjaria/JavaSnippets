import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args){
        System.out.println("Inside: " + Thread.currentThread().getName());
        System.out.println("Creating Executor Service...");
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Runnable worker = () -> {
            System.out.println("Inside: " + Thread.currentThread().getName());
        };
        for (int i = 0; i < 10; i++){
            executorService.submit(worker);
        }
        executorService.shutdown();
    }
}