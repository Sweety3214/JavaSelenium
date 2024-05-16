package classqspider;

public class Size {
    public static void main(String[] args) {
        byte mini = -128; // 2 ^ 7
        byte max = 127;
        short miniS = -32768;  //2^15
        short maxS = 32767;
        int miniI = -2147483648;
        int maxI = 2147483647;
        float miniF = 1.4f;
        long miniL = -9223372036854775807l;
        long maxL = 9223372036854775807l;
        double maxD = 1.7976931348623157E308d;
        System.out.println(mini);
        System.out.println(max);
        System.out.println(miniS);
        System.out.println(maxS);
        System.out.println(miniI);
        System.out.println(maxI);
        System.out.println(miniF);
    }
}
