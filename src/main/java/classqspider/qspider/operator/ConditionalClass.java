package classqspider.qspider.operator;

public class ConditionalClass {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int c = 300;
        //  int lar=a>b? a:b;
        //int op=lar>c? lar:c;
        int lar = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(lar + " is greater");
    }
}
