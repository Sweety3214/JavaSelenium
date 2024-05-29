package classqspider.qspider.oops.upcasting.ex2up;


public class Main2 {
    public static void main(String[] args) {

        Parent p = new Parent();
        Child c = new Child();

        Parent p1 = new Child();     // upcasting ----Parent variableName= child obj

        Child c1=(Child)p1;          // downcasting   Child VariableNamw= (Child)ParentVariable
        summa(p);
        summa(c);
        summa(p1);

        // Child c1=new Parent();

    }


    public static void summa(Parent a) {

    }
}
