public class StackDemo {
    public static void main(String[] args){
        //Question 2
        System.out.println(containPattern("a+b&b+a"));
        System.out.println(containPattern("1+3&3-1"));
    }

    static boolean containPattern(String s) {
        Stack n = new Stack();
        int i;
        for(i=0;i<s.length();i++) {
            if(s.charAt(i)=='&')
                break;
            else {
                n.push(s.charAt(i));
            }
        }
        i++;
        while(!n.isEmpty()) {
            char c = n.pop();
            if(c!=s.charAt(i))
                return false;
            i++;
        }
        return true;
    }
}

