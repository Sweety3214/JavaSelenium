package classqspider.qspider.returnmethod;

public class StaticMethod {
    public static void main(String[] args) {
        String s = StaticMethod.staticMethod();
        System.out.println(s);
    }

    public static String staticMethod() {
        System.out.println("THIS IS STATIC METHOD");
        String s = null;
        return "nn";

    }

}
