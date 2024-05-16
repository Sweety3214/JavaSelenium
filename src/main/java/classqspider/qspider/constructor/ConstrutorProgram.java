package classqspider.qspider.constructor;

public class ConstrutorProgram {
    String bName;
    double price;

    ConstrutorProgram(String a, double d) {
        bName = a;
        price = d;
    }

    public static void main(String[] args) {
        ConstrutorProgram construtorProgram = new ConstrutorProgram("gel", 10);
        System.out.println(construtorProgram.bName);
    }

}
