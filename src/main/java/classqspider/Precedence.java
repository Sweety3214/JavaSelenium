package classqspider;

public class Precedence {
    public static void main(String[] args) {
        float a = (1f + 2f) * 2f / 10f;
        int b = (1 + 2) * 2 / 10;  //right to left
        float a1 = b;

        int prim = 10;

        String str = new String("banu");
        str = "jjjj";


        System.out.println(a);
        System.out.println(a1);
        System.out.println(b);
    }
}
