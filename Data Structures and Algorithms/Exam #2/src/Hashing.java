public class Hashing {
    private int arr[];

    public Hashing() {
        arr = new int[19];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
    }

    public void put(int k) {
        int h = (k % arr.length);
        int i = 0;
        while (arr[h] != -1) {
            i++;
            h = (k + i) % arr.length;
            if (i == arr.length) {
                return;
            }
        }
        arr[h] = k;
    }
    public void printTable() {
        System.out.print("[" + arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.print("," + arr[i]);
        }
        System.out.println("]");
    }
}