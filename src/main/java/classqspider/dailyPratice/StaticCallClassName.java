package classqspider.dailyPratice;

public class StaticCallClassName {                       // In static method---1.No Argu 2.parametrize
    public static void main(String[] args) {               // call by className.methodName

        System.out.println("Print Static with No Argument");
        int c = StaticCallClassName.staticWithNoArgu();
        System.out.println(c);
        System.out.println("Print Static with parametrized ");
        long y = StaticCallClassName.staticWithPara(34, 90);
        System.out.println(y);

    }

    public static int staticWithNoArgu() {
        int a = 10;
        int b = 20;
        int c = a + b;
        return c;
    }

    public static long staticWithPara(int x, int y) {
        int z = x * y;
        return z;
    }
}
