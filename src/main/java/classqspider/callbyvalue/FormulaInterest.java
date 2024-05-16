package classqspider.callbyvalue;

public class FormulaInterest {
    public static void main(String[] args) {
        float b = interestFormula(20, 30, 40);
        System.out.println(b);
    }

    public static float interestFormula(int p, int n, int r) {
        float a = (p * n * r) / 100f;
        return a;
    }
}
