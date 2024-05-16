package classqspider.pratice;

public class FindingPercentage {
    public static void main(String[] args) {
        float result = percentage(1260, 1500);
        System.out.println(result);
    }

    public static float percentage(float baseprice, float basewithtax) {
        float tax = basewithtax - baseprice;
        float per = (tax / baseprice) * 100f;
        return per;


    }
}
