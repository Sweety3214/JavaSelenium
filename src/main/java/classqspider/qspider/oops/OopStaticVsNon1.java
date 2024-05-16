package classqspider.qspider.oops;

public class OopStaticVsNon1 {
    static String name = "banu";

    static {
        System.out.println(name);
        System.out.println("THIS IS STATIC");
    }

    String name2 = "Jo";

    {
        System.out.println(name2);
        System.out.println("NON STATIC");
    }

    public static void main(String[] args) {
        OopStaticVsNon1 oopStatic1 = new OopStaticVsNon1();

    }
}
