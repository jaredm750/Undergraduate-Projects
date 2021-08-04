//Question 1 Demo
public class BinaryTreeDemo {
    public static void main(String[]args) {

        //ROOT NODE: A
        //LEAF NODES: D, E, F
        //THE POST-ORDER SEQUENCE D -> E -> B -> F ->C -> A
        //THE PREORDER SEQUENCE A -> B -> D -> E -> C -> F
        //THE INORDER SEQUENCE D -> B -> E -> A -> F -> C

        BinaryTree tree = new BinaryTree();
        tree.root = new Node('A');
        tree.root.left = new Node('B');
        tree.root.right = new Node('C');
        tree.root.left.left = new Node('D');
        tree.root.left.right = new Node('E');
        tree.root.right.left = new Node('F');

        //PRINT INORDER SEQUENCE
        System.out.println("Inorder");
        tree.inOrder(tree.root);
        System.out.println();

    }
}
