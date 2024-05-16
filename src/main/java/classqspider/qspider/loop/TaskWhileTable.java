package classqspider.qspider.loop;

public class TaskWhileTable {
    public static void main(String[] args) {
        int in = 1;
        while (in <= 10) {
            int table = 3 * in;
            System.out.println(in + "*" + "3" + "=" + table);
            in++;
        }
    }
}
