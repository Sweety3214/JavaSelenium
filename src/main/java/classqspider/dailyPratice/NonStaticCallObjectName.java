package classqspider.dailyPratice;

public class NonStaticCallObjectName {
    public static void main(String[] args) {
        NonStaticCallObjectName nonStaticCallObjectName = new NonStaticCallObjectName();   // call by create object
        //ClassName ClassName=new ClassName();
        System.out.println("Non Static");

        int y = nonStaticCallObjectName.nonStatic(10, 20);
        System.out.println(y);
        System.out.println("Non Static1");
        String name = nonStaticCallObjectName.nonStatic1("banu");
        System.out.println(name);

    }

    public int nonStatic(int input1, int input2) {
        int y = input1 + input2;
        return input1;

    }

    public String nonStatic1(String s) {
        // String name="Banu";
        return "Banu";
    }

}
