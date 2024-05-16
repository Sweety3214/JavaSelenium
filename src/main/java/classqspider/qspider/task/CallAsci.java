package classqspider.qspider.task;

public class CallAsci {
    public static void main(String[] args) {
        int x = ascii('c');
        System.out.println(x);
    }

    public static int ascii(char input) {
        int output;
        output = (int) input;
        return output;
    }

}