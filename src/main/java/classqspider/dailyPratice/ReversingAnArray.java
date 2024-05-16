package classqspider.dailyPratice;

public class ReversingAnArray {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        char[] charArrayReturn = new ReversingAnArray().returnTheArray(charArray);

        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArrayReturn[i]);
        }
    }

    public char[] returnTheArray(char[] charArray) {
        return charArray;
    }
}
