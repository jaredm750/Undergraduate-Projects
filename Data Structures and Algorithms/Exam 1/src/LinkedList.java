import java.util.Stack;

public class LinkedList {
    Node head;
    LinkedList(Node h) {
        this.head = h;
    }

    boolean isEqual(Node h1, Node h2) {
        while (h1 != null && h2 != null) {
            if (h1.data != h2.data) {
                return false;
            }
            h1 = h1.next;
            h2 = h2.next;
        }
        return true;

    }
    public boolean isEmpty() {
        return this.head == null;
    }

    void printList(Node node)
    {
        while (node != null)
        {
            System.out.print(node.data + "-->");
            node = node.next;
        }
    }

}

