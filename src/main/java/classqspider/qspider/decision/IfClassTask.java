package classqspider.qspider.decision;

import java.util.Scanner;

public class IfClassTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Eligible age to vote");   //statement
        int age = scanner.nextInt();
        int con = 18;
        if ((con >= 18)) {                 //condition true means statment will show , if false means statement is skipped
            // "if" only for 1 condition
            System.out.println("Eligible");  //statement
        }
    }
}

