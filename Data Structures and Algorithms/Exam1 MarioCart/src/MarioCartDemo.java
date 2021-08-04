public class MarioCartDemo {
    public static void main(String[] args)
    {
        //Linked List for Coins
        Node coin = new Node(10);
        Node second = new Node(110);
        Node third = new Node(20);
        Node fourth = new Node(50);

        coin.next = second;
        second.next = third;
        third.next = fourth;

        //Linked List for Green Mushrooms
        Node greenMushroom = new Node(0);
        Node second1 = new Node(2);
        Node third1 = new Node(0);
        Node fourth1 = new Node(1);

        greenMushroom.next = second1;
        second1.next = third1;
        third1.next = fourth1;

        //OUTPUT
        System.out.println(calculateCurrentLife(coin,greenMushroom));
    }

    public static int calculateCurrentLife(Node coin, Node greenMushroom) {
        //Set total number of lives to 3
        int totalLives = 3;

        //Set Variables for both sums
        int coinSum = 0, greenMushroomSum = 0;

        //Temp Nodes
        Node temp1 = coin;
        Node temp2 = greenMushroom;

        while(temp1!=null) {
            coinSum += temp1.data;
            greenMushroomSum += temp2.data;
            temp1 = temp1.next;
            temp2 = temp2.next;

        }
        //Calculate Total Lives
        totalLives = totalLives + (coinSum/100) + greenMushroomSum;

        // return the totalLives
        return totalLives;
    }
}
