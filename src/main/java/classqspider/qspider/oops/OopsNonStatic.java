package classqspider.qspider.oops;

public class OopsNonStatic {
    String input = "OOPS Non Static";

    {
        System.out.println(input);
    }

    public static void main(String[] args) {
        OopsNonStatic oopsNonStatic = new OopsNonStatic();
        System.out.println("MAIN METHOD");
    }
}
