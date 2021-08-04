package Question2;

//The answer is : 9
public class ForthDemo {
    public static void main(String[] args) {

        Forth forth = new Forth();

        String eqArray[] = {"1", "2", "+", "3", "*"};

        System.out.print("(1 2 + 3 * ) = ");
        forth.calc(eqArray);

        BinaryTree tree = new BinaryTree();
        tree.root = new Node("*");
        tree.root.left = new Node("+");
        tree.root.right = new Node("1");
        tree.root.left.left = new Node("2");
        tree.root.left.right = new Node("3");


        System.out.println("Print out of Forth sequence of a given binary AST: ");
        tree.preOrder(tree.root);
    }
}
