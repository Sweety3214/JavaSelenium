package classqspider.qspider.operator;

public class DecrementalClass {
    public static void main(String[] args) {
        //predremental
        int x = 100, z = 200;
        --x;   // ans 99
        System.out.println(--x); //ans 98 it give same line

        //postdecremental
        int a = 20, b = 30;
        System.out.println(a--); // ans 20 same num will get bcs jus updated in this line and give it to another line
        System.out.println(a--);  // ans 19
    }
}
