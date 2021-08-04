package Question2;

import java.util.*;

public class Forth {

    public void calc(String arr[]) {
        Stack<String> s = new Stack<>();
        int a, b;

        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case "+": {
                    a = Integer.parseInt(s.pop());
                    b = Integer.parseInt(s.pop());
                    s.push(String.valueOf(a + b));
                    break;
                }
                case "-": {
                    a = Integer.parseInt(s.pop());
                    b = Integer.parseInt(s.pop());
                    s.push(String.valueOf(b - a));
                    break;
                }
                case "*": {
                    a = Integer.parseInt(s.pop());
                    b = Integer.parseInt(s.pop());
                    s.push(String.valueOf(a * b));
                    break;
                }
                case "/": {
                    a = Integer.parseInt(s.pop());
                    b = Integer.parseInt(s.pop());
                    s.push(String.valueOf(b / a));
                    break;
                }
                default:
                    s.push(arr[i]);
            }
        }
        if (s.size() == 1) {
            System.out.println(s.peek());
        } else {
            System.out.println("Error");
        }
    }
}

