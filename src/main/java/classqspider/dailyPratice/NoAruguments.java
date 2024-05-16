package classqspider.dailyPratice;

public class NoAruguments {
    public static void main(String[] args) {        // without aruguments then no changes
        System.out.println("Print No Arugument ");  //  call by methodName()  onliy
        NoArgu();
        System.out.println("Print String Type");
        stringType();
    }

    public static void NoArgu() {
        int input1 = 10, input2 = 110;
        System.out.println(input1 + input2);
    }

    public static void stringType() {
        System.out.println("Hello String");
    }
}
