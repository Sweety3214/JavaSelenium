package classqspider.assignment;

import java.util.Scanner;

public class ScannerAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Student NAME ");
        String name = scanner.next();
        System.out.println(name);

        System.out.println("Enter the Student ID ");
        int id = scanner.nextInt();
        System.out.println(id);

        System.out.println("Enter the Student MARK ");
        int mark = scanner.nextInt();

        System.out.println(mark);
    }


}
