public class Question4 {
    public static void main(String[] args){

        String str = "test string";
        String reversedStr = reverse(str);
        System.out.println(reversedStr); //expect result: gnirts tset

    }

    public static String reverse(String str){
        if (str.isEmpty())
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
