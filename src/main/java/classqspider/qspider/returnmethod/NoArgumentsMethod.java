package classqspider.qspider.returnmethod;

public class NoArgumentsMethod {
    public static void main(String[] args) {

        System.out.println("GetString");
        System.out.println("Sub");
        sub();

        System.out.println("add");
        add();
        System.out.println("word");
        word();

        String a = getString();
        System.out.println(a);

    }

    public static String getString() { //static method, no argument,return type
        //////////////////////////////
        return "123";
    }


    public static void sub() {      //
        int a = 3, b = 4;
        System.out.println(a - b);


    }

    public static void add() {
        int x = 2, y = 4;
        System.out.println(x - y);

    }

    public static void word() {

        System.out.println("hello");
    }

}



