package classqspider.dailyPratice;

public class Parametrized {                                      //parametrized give arguments
    public static void main(String[] args) {                     // call by methodName(int a, int b)
        System.out.println("parametrized");
        parametrized(40, 90);
        System.out.println("String method");
        StringMethod("hai banu");
    }

    public static void parametrized(int ip1, int ip2) {
        System.out.println(ip1 + ip2);

    }

    public static void StringMethod(String s) {

        System.out.println(s);
    }
}
