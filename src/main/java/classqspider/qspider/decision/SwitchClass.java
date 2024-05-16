package classqspider.qspider.decision;

public class SwitchClass {
    public static void main(String[] args) {
        switch (1) {
            case 1: {
                System.out.println("case 1 ");

            }
            break;
            case 8: {
                System.out.println("case 8");
            }
            case 9: {
                System.out.println("case 9");   // will execute bcs it crt
            }
            case 9 + 10: {
                System.out.println("case 19");
                break;
            }
            default: {
                System.out.println("default");// will not execute bcs we mention "break" in above case

            }
        }
    }
}
