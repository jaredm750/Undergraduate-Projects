import java.util.*;
public class Decryption {
    static String decrpt(String s) {
        Queue<Character> q = new LinkedList<>();
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            q.add(s.charAt(i));
        }

        int i = 0;
        while (!q.isEmpty()){
            if (i % 2 == 0){
                result += q.remove();
            } else{
                q.add(q.remove());
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args){
        String input1 = "631758924";
        String input2 = "4589";

        //INPUT
        System.out.println("Input: "+input1);
        System.out.println("Input: "+input2);

        //OUTPUT
        System.out.print("Output: ");
        System.out.println(decrpt(input1));
        System.out.print("Output: ");
        System.out.println(decrpt(input2));
    }
}
