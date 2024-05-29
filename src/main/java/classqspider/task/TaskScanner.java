package classqspider.task;

import java.util.Scanner;

public class TaskScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the integer");
        int userNumber= scanner.nextInt();


        for (char letter = 'a'; letter <= 'z'; letter++) {
            System.out.print(letter + " ");
        }
    }

}
