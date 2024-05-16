package classqspider.pratice;

public class FindingTotalWithPercentage {
    public static void main(String[] args) {
        float result = findBasePrice(10000, 10);
        System.out.println(result);
    }

    public static float findBasePrice(float withTax, float per) {
        float result = (withTax / (1f + (per / 100f)));
        return result;

    }
}
