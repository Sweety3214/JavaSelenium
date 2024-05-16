package classqspider.qspider.constructor;

public class PrimeNumber {


    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        Boolean res = primeNumber.primeNum(29);
        if (res == true) {
            System.out.println("it is prime num");
        } else if (res == false) {
            System.out.println("It is not a prime num");
        }


    }

    private Boolean primeNum(int input) {

        Boolean flag = true;
        for (int i = 2; i <= input - 1; i++) {
            if (input % i == 0) {
                flag = false;
            }
        }
        return flag;
    }
}
