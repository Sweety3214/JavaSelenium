package classqspider.qspider.array;

public class ArrayMethod {
    public static void main(String[] args) {
        int f[] = {1, 4, 2, 8, 9};
        arraymethod(f, f);
    }

    public static void arraymethod(int u[], int x[]) {
        System.out.println(u[2]);
        System.out.println("for");
        for (int i = 0; i < 5; i++) {
            System.out.println(u[i]);
        }
    }
}
