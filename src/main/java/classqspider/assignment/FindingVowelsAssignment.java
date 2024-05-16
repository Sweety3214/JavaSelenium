package classqspider.assignment;

import java.util.Scanner;

public class FindingVowelsAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PRINT THE LETTERS");
        char vowel = scanner.next().charAt(0);


        if (vowel == 'a') {
            System.out.println("It is Lowercase vowel");
        } else if (vowel == 'e') {
            System.out.println("It is Lowercase vowel");
        } else if (vowel == 'i') {
            System.out.println("It is Lowercase vowel");
        } else if (vowel == 'o') {
            System.out.println("It is Lowercase vowel");
        } else if (vowel == 'u') {
            System.out.println("It is Lowercase vowel");
        } else if (vowel == 'A') {
            System.out.println("it is Uppercase vowel");
        } else if (vowel == 'E') {
            System.out.println("it is Uppercase vowel");
        } else if (vowel == 'I') {
            System.out.println("it is Uppercase vowel");
        } else if (vowel == 'O') {
            System.out.println("it is Uppercase vowel");
        } else if (vowel == 'U') {
            System.out.println("it is Uppercase vowel");
        } else {
            System.out.println("it is consonent");
        }
    }

}
