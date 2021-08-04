//Question 3
public class BinaryHeapDemo {
    public static void main(String[] args) {
        System.out.println(findParentValue(9));
        System.out.println(findParentValue(30));
        System.out.println(findParentValue(3));
        System.out.println(findParentValue(663));
    }

    public static int findParentValue(int n){
        int index = -1;
        int arr[] = {3, 10, 4, 11, 12, 6, 9, 15, 30};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == n) {
                        index = i;
                }
            }
                //Returns -1 if it does not have a parent node
            if (index == -1 || index == 0)
                return -1;
            return arr[(index - 1)/2];
    }
}

