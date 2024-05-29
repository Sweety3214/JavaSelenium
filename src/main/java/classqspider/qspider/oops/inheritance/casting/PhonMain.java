package classqspider.qspider.oops.inheritance.casting;

public class PhonMain {
    public static void main(String[] args) {
     /* //  Phone phone=new Phone();
       // KeypadChild1 keypadChild1=new KeypadChild1();
      //  AndriodChild2 andriodChild2=new AndriodChild2();
        Phone phone=new KeypadChild1();     //upcasting
       // KeypadChild1 keypadChild1=(KeypadChild1)phone();  downcasting
        System.out.println(((KeypadChild1)phone).price);
      /*  Phone phone1=new AndriodChild2();
      //  AndriodChild2 andriodChild2=(AndriodChild2)phone1();
        System.out.println(((KeypadChild1)phone1).price);*/
       //instanceOf Operator ex---

        AndriodChild2 andriodChild2=new AndriodChild2();
        System.out.println(andriodChild2.price);
        System.out.println(andriodChild2 instanceof Phone);
        System.out.println(andriodChild2 instanceof AndriodChild2);
      //  System.out.println(andriodChild2 instanceof KeypadChild1);
        Phone phone=new Phone();
        System.out.println(phone instanceof Phone);
        System.out.println(phone instanceof Object);
        System.out.println(phone instanceof AndriodChild2);
    }

}
