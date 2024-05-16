package classqspider.qspider;

public class TaskWideningandNarrow {

    public static void main(String[] args) {
        //WIDENING EXPLICITLY
        short v = 7;
        byte b;
        b = (byte) v;  //b=7
        System.out.println(b);
        //IMPLICITLY
        byte b2 = 8;
        short s;
        s = b2; //s=8
        System.out.println(s);
        //NARROWING EXPLICITLY
        byte b1 = 8;
        short s1;
        s1 = (short) b1; // s1=8
        System.out.println(s1);
    }
}
