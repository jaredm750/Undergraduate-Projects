package Question2;

public class BinaryTree {
    // Root of Binary Tree
    Node root;

    BinaryTree() {
        root = null;
    }
    void preOrder(Node node) {
        if (node == null)
            return;
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
}
