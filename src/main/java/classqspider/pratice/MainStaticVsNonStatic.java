package classqspider.pratice;

public class MainStaticVsNonStatic {
    public static void main(String[] args) {
        StaticVsNonStatic staticVsNonStatic = new StaticVsNonStatic();
        String v = staticVsNonStatic.nonStaticMethod();
        System.out.println(v);

        int asciiValue = StaticVsNonStatic.staticMethod();
        System.out.println(asciiValue);


    }

}
