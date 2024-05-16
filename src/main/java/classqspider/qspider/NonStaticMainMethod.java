package classqspider.qspider;

public class NonStaticMainMethod {
    public static void main(String[] args) {
        NonStatic nonStatic = new NonStatic();
        String m = nonStatic.non();
        System.out.println(m);

    }
}
