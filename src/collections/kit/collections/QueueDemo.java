package collections.kit.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("java");
        queue.add("python");
        queue.add("scala");
        queue.add("elk");
        queue.add("kafka");

        System.out.println(queue);

        System.out.println(queue.peek());

        System.out.println(queue.poll());
    }
}
