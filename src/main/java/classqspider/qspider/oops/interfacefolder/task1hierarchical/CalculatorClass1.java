package classqspider.qspider.oops.interfacefolder.task1hierarchical;

public class CalculatorClass1 implements Calulator {
    String calName="Scientific";
    public void calClass1(){
        System.out.println("it is from CALCULATOR CLASS 1");
    }

    @Override
    public void interfacemethod() {
        System.out.println("Calculator");
    }
}
