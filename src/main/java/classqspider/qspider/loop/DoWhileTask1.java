package classqspider.qspider.loop;

public class DoWhileTask1 {   //program for print one time
    public static void main(String[] args) {
        int one = 0;
        do {
            System.out.println("Print one thime" + " " + one);
            one++;
        }
        while (one == 2);   //false
    }
}
