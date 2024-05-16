package classqspider.qspider.loop;

public class NestedLoop {
    public static void main(String[] args) {

        for (int r = 1; r <= 6; r++) {
            for (int c = 1; c <= 3; c++) {

                System.out.print("@");
            }
            System.out.println();
        }
    }


}
