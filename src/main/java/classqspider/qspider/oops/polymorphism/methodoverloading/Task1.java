package classqspider.qspider.oops.polymorphism.methodoverloading;

public class Task1 {
    public static void main(String[] args) {
        task1(2,3);
        task1(3.5f,3.4f,4.6f);
    }
    public static void task1(int a , int b){
        System.out.println(a*b);
    }
    public static void task1(Object a, Object b , Object c){

        float val=1.0f;

        if (a instanceof Float){
            float convertingA=(float)a;
            val = val*convertingA;
        }
        if(b instanceof Float){
            float convertingB=(float)b;
            val=val*convertingB;
        }
        if(c instanceof  Float){
            float convertingC=(float)c;
            val=val*convertingC;
        }

        System.out.println(val);
    }
}
