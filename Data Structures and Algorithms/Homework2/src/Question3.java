/*
Print an Array  7,6,5,4,3,2,1 using recursion
*/
public class Question3 {
    private static int[] array = {1,2,3,4,5,6,7};

    public static void main(String[] args) {
        /*Iterative Way
        for (int e: array)
            System.out.println(e);
         */
        printRecursion(array.length);
    }
    //Recursive
    public static void printRecursion(int i) {
        if (i > 0) {
            System.out.print(i+",");
            printRecursion(i-1);
        }
    }
}
