package classqspider.qspider.oops.interfacefolder.examplemultipleandhibrid;

public class InterClass extends InterClass2 implements IF1, IF2 {
   public void abMethod(){
       System.out.println("it from IF1");
    }

    @Override
    public void bcMethod() {
        System.out.println("it fom IF2");
    }

    public static void main(String[] args) {
        InterClass interClass=new InterClass();
        interClass.abMethod();  // implement from from interface 1
        interClass.bcMethod();  //implement from interface 2
        interClass.IC();   //extends from class 2

    }
}
