package classqspider.qspider;


import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE DATA");
        byte a = scanner.nextByte();
        System.out.println(a);
        System.out.println("ENTER THE BOLOLEAN VALUE");
        boolean tf = scanner.nextBoolean();
        System.out.println(tf);
        System.out.println("enter the String");
        String s1 = scanner.next();
        System.out.println(s1);


        System.out.println("ENTER THE LINE");
        String s = scanner.nextLine();
        System.out.println(s);

    }
}
