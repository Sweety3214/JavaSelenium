package classqspider.pratice;

public class ChangeNumber {
    public static void main(String[] args) {
        int a = 2, b = 5, c;
        c = a; // a=2, b=5,c=2
        a = b; //a=5,b=5 ,c=2
        b = c; //b=2 .c=2, a=5


        System.out.println("A is " + a);
        System.out.println("B is " + b);


    }
}
