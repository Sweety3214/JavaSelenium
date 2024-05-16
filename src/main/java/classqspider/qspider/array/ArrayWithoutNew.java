package classqspider.qspider.array;

public class ArrayWithoutNew {
    public static void main(String[] args) {
        int[] c = {1, 3, 4, 5};         //declaration and initialization  // without object (new)
        System.out.println(c.length);  //finding length
        System.out.println(c[2]);
        for (int i = 0; i < c.length; i++) {   // for using instant of avoid repeating print
            System.out.println(c[i]);
        }
    }
}
