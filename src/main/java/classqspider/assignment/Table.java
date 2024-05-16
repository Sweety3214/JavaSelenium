package classqspider.assignment;

public class Table {
    public static void main(String[] args) {

        for (int i = 5; i <= 10; i++) {           // i= which table ex table 5 to table 10
            for (int j = 1; j <= 10; j++) {       //j= from 1 to 10 ex 10th table from 1 to 10
                System.out.println(i + "*" + j + "=" + i * j);
            }
            System.out.println();
        }
    }
}
