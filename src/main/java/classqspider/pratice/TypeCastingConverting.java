package classqspider.pratice;

public class TypeCastingConverting {
    public static void main(String[] args) {
        //Narrowing Implicitly
        int x = 100;
        float f;
        f = x;
        System.out.println(f);

        //explicitly
        char c = 'J';
        int c1;
        c1 = (int) c;
        System.out.println(c1);

        // widening explicitly
        long l = 488774993l;
        int l1;
        l1 = (int) l;
        System.out.println(l1);
    }
}
