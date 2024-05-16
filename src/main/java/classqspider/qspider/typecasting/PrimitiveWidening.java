package classqspider.qspider.typecasting;

public class PrimitiveWidening {
    public static void main(String[] args) {
        int a = 9;
        double d;
        d = a;  //d=9  implicitly --- compiler by adding typecast operator internally f=(float)b
        System.out.println(d);  // converting int into double as d=9.0

        short a1 = 45;
        float d1;
        // d1=a1;
        d1 = (float) a1;// explicitly---programer
        System.out.println(d1);


    }

}
