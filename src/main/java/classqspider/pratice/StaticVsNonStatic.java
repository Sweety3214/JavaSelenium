package classqspider.pratice;

public class StaticVsNonStatic {

    public static int staticMethod() {
        System.out.println("In side staticMethod");
        int ascii = 'c';
        return ascii;


    }

    public String nonStaticMethod() {
        System.out.println("In side Non-Static Method");
        String s = "null";
        return s;
    }

}
