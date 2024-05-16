package classqspider.dailyPratice;

public class IfClass {
    public static void main(String[] args) {
        IfClass ifClass = new IfClass();
        int greatervalue = ifClass.greater(25, 45, 79);
        System.out.println(greatervalue);
        int greatervalue2 = ifClass.greater(25, 4, 7);
        System.out.println(greatervalue2);

    }

    public int greater(int age1, int age2, int age3) {

        int max = 0;
        if ((age1 > age2) && (age1 > age3)) {
            max = age1;
        } else if ((age2 > age1) && (age2 > age3)) {
            max = age2;
        } else {
            max = age3;
        }

        return max;

    }

}



