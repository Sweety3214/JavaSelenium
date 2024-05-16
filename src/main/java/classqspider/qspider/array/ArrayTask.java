package classqspider.qspider.array;

public class ArrayTask {
    public static void main(String[] args) {
        int a[] = new int[10];
        System.out.println("Print the length of a" + a.length);
        int table = 5;
        for (int i = 0; i < a.length; i++) {
            a[i] = table;
            table = table * 5;
            System.out.println(a[i]);

        }
    }

}

