import priorityQueue.PriorityQueue;
import priorityQueue.linkedList.LinkedListPriorityQueue;

import java.util.Random;

public class Main {
    private static final Random random = new Random();

    public static void main(String[] args) {


        System.out.println("------------------------------------");
        System.out.println("- Using LinkedList Implementations -");
        System.out.println("------------------------------------");

        PriorityQueue listQueue = new LinkedListPriorityQueue();
        enqueueRandomNumbers(listQueue);
        dequeueRandomNumbers(listQueue);

        for (int i = 0; i < 50; i++) {
            listQueue.enqueue(random.nextInt(Integer.MAX_VALUE));
        }

        System.out.println("-----------------------------");
        System.out.println("- Using BST Implementations -");
        System.out.println("-----------------------------");

        PriorityQueue bstQueue = new LinkedListPriorityQueue();
        enqueueRandomNumbers(bstQueue);
        dequeueRandomNumbers(bstQueue);
    }

    public static void enqueueRandomNumbers(PriorityQueue queue) {
        for (int i = 0; i < 50; i++) {
            queue.enqueue(generatePositiveNumber());
        }
    }

    public static void dequeueRandomNumbers(PriorityQueue queue) {
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }

    public static int generatePositiveNumber() {
        return random.nextInt(Integer.MAX_VALUE);
    }
}
