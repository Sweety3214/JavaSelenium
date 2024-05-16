package classqspider.assignment;

public class ParametrizedMethod {
    public static void main(String[] args) {
        System.out.println("MAIN METHOD");
        mul(5, 10);
        div(55, 2);
    }

    public static void mul(int a, int b) {
        System.out.println(a * b);


    }

    public static void div(float x, float y) {
        System.out.println(x / y);
        System.out.println("div method");
        byte p = 56, q = 13;
        mod(p, q);
    }

    public static void mod(byte m, byte n) {
        System.out.println(m % n);

    }
}
