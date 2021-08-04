public class BinaryTree {
    Node root;

    public BinaryTree(char data){
        root = new Node(data);
    }

    public BinaryTree() {
        root = null;
    }

    public void inOrder(Node node){
        if (node == null)
            return;

        inOrder(node.left);

        System.out.print(node.val + "->");

        inOrder(node.right);
    }

}