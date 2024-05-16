package classqspider.qspider.array;

import java.util.Arrays;

public class ArrayNew {
    public static void main(String[] args) {
        int[] a = new int[5];      // array object creation statement
        System.out.println(a.length);

        int table = 10;
        for (int i = 0; i < a.length; i++) {
            a[i] = table;     //a[i]=10
            table = table + 10;    //table=10+10

        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println(Arrays.toString(a));

        /*int j = 1;
        while (j < a.length) {
            System.out.println(a[j]);
            j++;
        }

        int z=0;
        do {
            System.out.println(a[z]);
            z++;
        }
        while (z < a.length);*/
    }
}
