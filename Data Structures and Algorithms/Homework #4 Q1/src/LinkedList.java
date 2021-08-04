public class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int size() {
        int count = 0;
        Node p = head;

        while (p != null) {
            count++;
            p = p.next;
        }
        return count;
    }

    public String toString()
    {
        Node ref = head;
        String result = "";
        while(ref != null)
        {
            result += ref.data + "-->";
            ref = ref.next;
        }
        return result;
    }

    public void addEnd(Node e)
    {
        if(isEmpty())
            head = e;
        else{
            Node fast = head;
            Node slow = head;
            while(fast != null)
            {
                slow = fast;
                fast = fast.next;
            }
            slow.next = e;
        }
    }

    public void addIndex(Node e, int index){
        if(index < 0 && index > size()){
            throw new IndexOutOfBoundsException();
        }
        if(index == 0){
            head = e;
        }
        Node pred = head;
        for(int k = 1; k < index; k++)
            pred = pred.next;
        if(pred.next != null)
            e.next = pred.next;
        pred.next = e;
    }

    public int getIndex(int v){
        int index = 0;
        Node p = head;
        while(p != null) {
            if (p.data == v)
                return index;
            index++;
            p = p.next;
        }
        return -1;
    }

    public boolean removeValue(int v) {
        int index = getIndex(v);
        if(index == -1)
            return false;
        if(index == 0){
            head.next = head.next.next;
        }
        else{
            Node pre = head;
            while(index != 1){
                pre = pre.next;
                index --;
            }
            pre.next = pre.next.next;
        }
        return true;
    }

    void add(int val) {
        if(head == null) {
            head = new Node(val);
        }else {
            Node temp = head;

            while(temp.next!=null) {
                temp = temp.next;
            }
            temp.next = new Node(val);
        }
    }
    LinkedList greaterThan(LinkedList l, int n) {
        LinkedList holder = new LinkedList();
        Node temp =  l.head;
        while(temp!=null) {
            if(temp.data > n) {
                holder.add(temp.data);
            }
            temp = temp.next;
        }

        return holder;
    }

}