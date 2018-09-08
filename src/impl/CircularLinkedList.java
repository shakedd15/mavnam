package impl;

public class CircularLinkedList {
    private ListNode head;

    public CircularLinkedList(ListNode head) {
        this.head = head;
    }

    public void insert(int value) {
        ListNode node = new ListNode(value, null);

        if (isEmpty()) {
            this.head = node;
            node.setNext(node);
        } else {
            ListNode currentNode = this.head;

            while(!currentNode.getNext().equals(this.head)) {
                currentNode = currentNode.getNext();
            }

            currentNode.setNext(node);
            node.setNext(this.head);
            this.head = node;
        }
    }

    public int remove() {
        if (this.isEmpty()) {
            return 0;
        }

        int value = this.head.getValue();

        // if only the head exist
        if (this.getHead().getNext().equals(this.getHead())) {
            this.head = null;
        } else {
            this.head.setValue(this.head.getNext().getValue()); // replace head value with next value
            this.head.setNext(this.head.getNext().getNext()); // delete second value
        }

        return value;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public ListNode getHead() {
        return head;
    }
}
