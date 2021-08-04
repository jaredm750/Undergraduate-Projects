import java.util.*;
public class Parenthesis{
     public static boolean isValidParentheses(String str) {
         //Create Stack
        Stack<Character> s = new Stack<Character>();

        //For loop
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                s.push(c);
            else if (!s.empty()) {
                if(c == ')' && s.peek() == '(')
                    s.pop();
                else if(c == '}' && s.peek() == '{')
                    s.pop();
                else if(c == ']' && s.peek() == '[')
                    s.pop();
                else
                    return false;
            }
        }
        //If bracket is empty
        return s.empty();
    }
    //CHANGED METHOD to STATIC METHOD TO TEST RUN DIFFERENT CASES
    public static void main(String[] args){
         String s = "([])";
         System.out.println(isValidParentheses(s));
         s = "([)]";
         System.out.println(isValidParentheses(s));
         s = "";
         System.out.println(isValidParentheses(s));

    }
}