package classqspider.qspider.decision;

import java.util.Scanner;

public class TaskIfElseLadder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Assci value for ");
        char output = scanner.next().charAt(0);
        char input = 'c';
        int c1;
        c1 = (int) input;
        System.out.println(c1);

        char output1 = scanner.next().charAt(0);
        char input1 = 'b';
        int b1;
        b1 = (int) input1;
        System.out.println(b1);


        // int assci1=99;
        //  int assci2=98;
        if (c1 == b1) {
            System.out.println("Assci1 value is correct is same");
        } else if (c1 > b1) ;
        {
            System.out.println("c1 value is greater");
        }
      /* else{
            System.out.println("Assci value for a is less");
        }*/
    }

}
