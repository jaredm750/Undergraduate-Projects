import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        Scanner kbd = new Scanner(System.in);

        int num;
        System.out.println("Enter a number: ");
        num = kbd.nextInt();

        //Recursive Function
        System.out.println(recFunc(num));

        //Iterative Function
        System.out.println(itFunc(num));

    }

    //Recursive Function
    public static int recFunc(int n){
        if (n < 3)
            return n;
        else
            return recFunc(n-1) + 2*recFunc(n-2) + 3*recFunc(n-3);
    }

    //Iterative Function
    public static int itFunc(int n){
        int[] arr = new int[n+1];

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;

        for(int i = 3; i <= n; i++)
            arr[i] = arr[i-1] + 2*arr[i-2] + 3*arr[i-3];

        return arr[n];

    }

}
