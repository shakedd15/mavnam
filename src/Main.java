import impl.BinarySearchTree;
import impl.LinkedListPriorityQueue;

public class Main {
    public static void main(String[] args) {

//        LinkedListPriorityQueue queue = new LinkedListPriorityQueue();
//        queue.enqueue(1);
//        queue.enqueue(3);
//        queue.enqueue(4);
//        queue.enqueue(2);
//        queue.enqueue(5);
//
//        while (!queue.isEmpty()) {
//            System.out.println(queue.dequeue());
//        }

        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(6);
        tree.insert(20);
        tree.insert(30);

        System.out.println();
    }
}
