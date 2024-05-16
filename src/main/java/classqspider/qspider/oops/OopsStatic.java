package classqspider.qspider.oops;

public class OopsStatic {
    static int input = 10;      //single line

    static {
        System.out.println("hai");       /// multi line
        System.out.println(input);
        afterMain();
    }

    static {
        System.out.println("hai2");
    }

    static {
        System.out.println("After main method");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }

    public static void afterMain() {
        System.out.println("Static Void");
    }

}
