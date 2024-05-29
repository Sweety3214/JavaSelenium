package classqspider.callbyvalue;

public class SwapNum {
    public static void main(String[] args) {
        int d = swap(30, 40);
        System.out.println(d);
    }

    public static int swap(int a, int b) {
        int c;
        c = a; //a=30 b=40 c=30
        a = b; //a=40 b=40 c=30
        b = c; // a=40 b=30 c=30

        int f = 0;
        return 0;

    }

}
