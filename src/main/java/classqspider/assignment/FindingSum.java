package classqspider.assignment;

public class FindingSum {
    public static void main(String[] args) {
        int n = 100;
        // int sum=n*(n+1)/2;      //type 1
        // System.out.println("Print the sum of 1 to 100 is "+" " + sum);
        int sum = 0;                               //type 2
        for (int i = 1; i <= n; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
    }
}
