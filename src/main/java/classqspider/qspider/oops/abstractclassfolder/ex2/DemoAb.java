package classqspider.qspider.oops.abstractclassfolder.ex2;
abstract class DemoAb {   // abstract class
    String name="ABSTARCT";

   abstract void abstractMethod() ; //abstract method

   public class Test extends DemoAb {

       void abstractMethod(){
           System.out.println("FROM ABSTRACT");
       }
       public static void main(String[] args) {

       }
   }
}

