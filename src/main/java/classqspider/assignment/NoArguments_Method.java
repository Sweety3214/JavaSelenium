package classqspider.assignment;

public class NoArguments_Method {
    public static void main(String[] args) {

        add();
        sub();
        System.out.println("MAIN METHOD");
    }

    public static void add() {
        int x = 5, y = 10;
        System.out.println(x + y);


    }

    public static void sub() {
        int a = 10, b = 2;
        System.out.println(a - b);

    }
}
