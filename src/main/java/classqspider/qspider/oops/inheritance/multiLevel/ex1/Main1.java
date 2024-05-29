package classqspider.qspider.oops.inheritance.multiLevel.ex1;

public class Main1 {
    public static void main(String[] args) {
        Son son =new Son();
        son.gName();  // non static call using obj name
        son.fAge();
        son.address();
        GFather.gName();   // static call using clas name

    }
}
