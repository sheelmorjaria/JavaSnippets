import java.util.LinkedList;
import java.util.Queue;

public class ExampleQueue {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        //offer method inserts the specified element into the queue
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("Queue: " + queue);
        //peek method returns head of the queue
        int accessedNumber = queue.peek();
        System.out.println("Accessed Element: " + accessedNumber);
        //poll method removes the head of the queue
        int removedNumber= queue.poll();
        System.out.println("Removed Element: " +  removedNumber);

        System.out.println("Updated queue: " + queue);
    }
}