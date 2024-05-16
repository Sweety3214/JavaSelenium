package classqspider.qspider.decision;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eligible age to vote");
        int age = scanner.nextInt();
        // int con = 18;
        if (age >= 18) {
            System.out.println(" Eligible");
        } else {
            System.out.println("not Eligible");
        }
        System.out.println("Thank You");

    }
}
