package BinaryTree;

public class BinaryTree {
    private static Node root;

    public BinaryTree(int data){
        root = new Node(data);
    }

    public Node getRoot(){
        return root;
    }

    public void add(Node parent, Node child, String orientation){
        if(orientation.equals("left")){
            parent.left = child;
        }
        else{
            parent.right = child;
        }
    }
}
