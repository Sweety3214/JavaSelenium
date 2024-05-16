package classqspider.qspider.loop;

public class NesstedLoopTask1 {
    public static void main(String[] args) {
        for (int i = 5; i <= 10; i++) {
            for (int j = 1; j <= 10; j++)
                System.out.println(i * j * j);
        }
        System.out.println("__________________________");
    }
}
