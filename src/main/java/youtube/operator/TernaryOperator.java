package youtube.operator;

public class TernaryOperator {
    public static void main(String[] args) {
        //var=exp ? result 1: result 2;
        //ex
        int a=200,b=400;
        int result=(a<b)? a:b;  //  con is true so ans is 200 if con false then ans is 400
        System.out.println(result);
        int result2=(a>b)? a:b;
        System.out.println(result2);
    }
}
