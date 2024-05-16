package classqspider.qspider.returnmethod;

public class ReturnType {
    public static void main(String[] args) {
        int d = add(3, 8);
        System.out.println(d);
        stype();

        int k = twovalues(3, 5);
        System.out.println(k + " Two values");

    }

    public static int add(int a, int b) {
        int c = a + b;

        return c;
    }

    public static void stype() {
        System.out.println("HELOO BANU");
        return;


    }


    public static int twovalues(int z, int y) {
        int i = z + y;
        int j = z - y;
        return j; // it only one value will return


    }
     /* just try converting
    public static void converting (int m, int n){
        byte l=m+n;
        return l;


    } */


}
