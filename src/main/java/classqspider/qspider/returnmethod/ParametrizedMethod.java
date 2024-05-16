package classqspider.qspider.returnmethod;

public class ParametrizedMethod {
    public static void main(String[] args) {
        add(6, 1);
        st("Banu");
    }

    public static void add(int a, int b) {
        System.out.println(a + b);

    }

    public static void st(String s) {

        System.out.println(s);
    }

}

