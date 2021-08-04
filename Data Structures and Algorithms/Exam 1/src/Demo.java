public class Demo {
    public static void main(String[] args) {
        //First LinkedList
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        LinkedList l1 = new LinkedList(first);

        first.next = second;
        second.next = third;

        //Second LinkedList
        Node first1 = new Node(1);
        Node second1 = new Node(3);
        Node third1 = new Node(2);

        first1.next = second1;
        second1.next = third1;

        LinkedList l2 = new LinkedList(first1);

        //Print out First List
        l1.printList(first);
        System.out.println();
        //Print Out Second List
        l2.printList(first1);

        System.out.println();

        //Compare Linked List
        System.out.println(l1.isEqual(first, first1));
    }
}
