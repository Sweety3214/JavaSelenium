package classqspider.qspider.oops;

public class OopStaticVsNon {
    static int gold = 916;
    static double price = 50000;

    static {
        System.out.println("PRINT BRAND NAME OF GOLD");
        System.out.println(gold);

    }

    static {
        System.out.println("PRINT THE PRICE");
        System.out.println(price);
    }

    String product = "Chain";

    {
        System.out.println("PRINT PRODUCT NAME");
        System.out.println(product);
    }

    public static void main(String[] args) {
        OopStaticVsNon oopStaticVsNon = new OopStaticVsNon();
        System.out.println("MAIN METHOD");
    }
}
