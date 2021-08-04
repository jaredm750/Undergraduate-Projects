//Question 2 Demo
public class HashingDemo {
    public static void main(String[] args) {
        Hashing table = new Hashing();

        table.put(35);
        table.put(16);
        table.put(23);
        table.put(54);
        table.put(55);

        table.printTable();
    }
}
