package youtube.operator;

public class DemoOperator {
    public static void main(String[] args) {    //a,b operand   ---+,= - operator
        int a=10, b=100;


        //Arithmatic
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b); //q
        System.out.println(a%b); //r
        System.out.println(a*b);
        //Relational
        System.out.println(a==b);//f
        System.out.println(a!=b); //t
        System.out.println(a<=b);//t
        System.out.println(a<b); //t
        System.out.println(a>=b); //f
        System.out.println(a>b);//f
        //logical

        boolean x=true;
        boolean y=false;

        System.out.println(x && y); //f
        System.out.println(x || y); //t
        System.out.println(! y); //t
        System.out.println(!x);   //f
            }
}
