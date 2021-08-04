public class Demo {
    public static void main(String[] args) {
        //Create LinkedList
        LinkedList l1 = new LinkedList();

        //Add Nodes to LinkedList using add() method
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(1);
        l1.add(10);
        l1.add(20);

        //Second LinkedList
        LinkedList l2 = new LinkedList();
        l2.add(97);
        l2.add(99);
        l2.add(7);
        l2.add(1);
        l2.add(10);
        l2.add(20);

        //input
        System.out.println("Input: " + l1);
        //output
        System.out.println("Output: " + l1.greaterThan(l1, 6));

        //input
        System.out.println("Input: " + l2);
        //output
        System.out.println("Output: " + l2.greaterThan(l2, 20));
    }
}