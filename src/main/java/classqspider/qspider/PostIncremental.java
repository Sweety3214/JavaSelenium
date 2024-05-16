package classqspider.qspider;

public class PostIncremental {
    public static void main(String[] args) {
        int a = 20, b = 10;
        System.out.println(a++); // ans is 20 bcs we  just asign in print
        System.out.println(a++); //ans is 21 bcs we asign in above line
        b++;                    //statement
        System.out.println(b++); //ans is 11 bcs we asign as statement in above line

        //pre incremental
        int x = 90, z = 80;
        System.out.println(++x);  //ans is 91 preincre it will increase in same line
        ++z;                    //ANS81
        System.out.println(++z); // 82

    }
}
