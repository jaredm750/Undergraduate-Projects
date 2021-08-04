public class Demo {
    public static void main(String[] args) {
        //First
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        LinkedList l1 = new LinkedList(first);

        first.next = second;
        second.next = third;
        third.next = fourth;

        //Second
        Node first1 = new Node(1);
        Node second1 = new Node(2);
        Node third1 = new Node(3);
        Node fourth1 = new Node(5);

        first1.next = second1;
        second1.next = third1;
        third1.next = fourth1;
        LinkedList l2 = new LinkedList(first1);

        //Print out First List
        l1.printList(first);
        System.out.println();
        //Print Out Second List
        l2.printList(first1);

       System.out.println();

        //Compare linked list Q1
        System.out.println("Are the two lists the same? True or False.Q1");
        System.out.println(l1.isEqual(first,first1));

        //Insert a Node to Linked List Q2
        System.out.println("Add node to ith Q2");
        l1.insert(8);
        Node ref = l1.head;
        while(ref != null)
        {
            System.out.print(ref.data + "-->");
            ref = ref.next;
        }
        System.out.println();

        //Concatenate Linked List Q3
        System.out.println("Concatenate Two Linked Lists Q3");
        l1.concatenate(first,first1);
        l1.printList(first);
        System.out.println();

        //Reverse linked list Q4
        first = l1.reverse(first);
        System.out.println("Reverse the new Concatenated Linked list Q4");
        l1.printList(first);

    }
}
