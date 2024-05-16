package classqspider.qspider.typecasting;

public class PrimitiveNarrowing {

    public static void main(String[] args) {
        long lg = 59555578l;
        int fl = (int) lg;  // explicitly converting Long(high data type)  into float(lower data type)
        System.out.println(fl);

        double d = 56.9;
        int i;
        // i=d;  //it make error bcs in narrowing only possible to explicitly. implicitly is not possible
        i = (int) d;  //  explicitly
        System.out.println(i);   // ans is 56 bcs it converted 56.9 into 56


    }
}
