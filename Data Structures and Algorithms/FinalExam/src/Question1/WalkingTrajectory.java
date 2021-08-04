package Question1;

public class WalkingTrajectory {
        public static void main(String[] args) {

            Node first = new Node(1.1,8.7);
            Node second = new Node(9.1,2.3);
            Node third = new Node(3.0,6.4);
            Node fourth = new Node(2.2,7.8);
            Node fifth = new Node(2.2,7.8);
            LinkedList l = new LinkedList(first);

            first.next = second;
            second.next = third;
            third.next = fourth;
            fourth.next = fifth;

            l.findMax();

        }
}
