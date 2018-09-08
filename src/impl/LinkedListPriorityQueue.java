package impl;

public class LinkedListPriorityQueue implements PriorityQueue {
    private CircularLinkedList list = new CircularLinkedList(null);

    @Override
    public void enqueue(int value) {
        if (list.isEmpty()) {
            list.insert(value);
        } else {
            if (this.list.getHead().getValue() <= value) {
                this.list.insert(value);
            } else {
                ListNode currentNode = list.getHead();

                while (currentNode.getNext().getValue() >= value &&
                        !currentNode.getNext().equals(list.getHead())) {
                    currentNode = currentNode.getNext();
                }

                ListNode nodeToInsert = new ListNode(value, currentNode.getNext());
                currentNode.setNext(nodeToInsert);
            }
        }
    }

    @Override
    public int dequeue() {
        return this.list.remove();
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }
}
