public class LinkedList {
    Node head;
    Node end;
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

    void printList(Node node)
    {
        while (node != null)
        {
            System.out.print(node.data + "-->");
            node = node.next;
        }
    }
    Node insert(int x) {
        Node newNode = new Node(x);
        if(head == null) {
            head = newNode;
            end = newNode;
        }
        else {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
        return head;
    }
    static Node concatenate(Node first, Node first1) {
        Node last = first;

        while (last != null) {
            if (last.next == null && first1 != null) {
                last.next = first1;
                break;
            }
            last = last.next;
        }
        return first1;
    }

    static Node reverse(Node node)
    {
        Node prevNode = null;
        Node currentNode = node;
        Node nextNode = null;

        while (currentNode != null)
        {
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        node = prevNode;
        return node;
    }
}
