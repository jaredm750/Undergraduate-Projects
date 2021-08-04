public class Stack {
    static final int MAX = 100;
    int top = 0;
    char ch[] = new char[MAX]; // create stack array with size

    boolean push(char c) {
        ch[++top] = c;
        return true;
    }
    char pop () {
        char c = ch[top--];
        return c;
    }

    boolean isEmpty() {
        return top == 0;
    }
}


