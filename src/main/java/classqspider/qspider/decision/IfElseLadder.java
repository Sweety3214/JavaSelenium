package classqspider.qspider.decision;

public class IfElseLadder {
    public static void main(String[] args) {
        int a = 100;
        int b = 250;
        if (a == b) {
            System.out.println("a is Equal to b");
        } else if (a > b) {
            System.out.println("a is greater than b");
        } else {      // default
            System.out.println("a is less than b");
        }
    }
}
