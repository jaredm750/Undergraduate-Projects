/*
Print an Array 1,2,3,4,5,6,7 using recursion
 */

public class Question2 {
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
            printRecursion(i-1);
            System.out.print(i+",");
            ;
        }

    }
}
