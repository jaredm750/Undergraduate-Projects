package Question1;

public class LinkedList {
    Node head; //head Node

    LinkedList(Node h) {
        this.head = h;
    }

    public void findMax(){
        double length=0;
        double dX=0;
        double dY=0;

        Node curr = this.head;

        while(curr != null) {
            //length = sqrt dX^2 + dY^2
            double l = Math.sqrt(Math.pow(curr.dX,2)+Math.pow(curr.dY,2));
            if(l > length) {
                length=l;
                dX=curr.dX;
                dY=curr.dY;

            }
            curr=curr.next;
        }
        System.out.println("("+dX+","+dY+") Has the longest trajectory"+ "\nLength: "+length);
    }
}
