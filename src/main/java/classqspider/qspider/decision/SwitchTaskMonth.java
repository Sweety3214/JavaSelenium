package classqspider.qspider.decision;

public class SwitchTaskMonth {

    int input;

    public static void main(String[] args) {
        SwitchTaskMonth switchTaskMonth = new SwitchTaskMonth();
        switchTaskMonth.ifClass(1);
        switchTaskMonth.switchclass(1000);
    }

    public void ifClass(int inputs) {

        input = inputs;


        if (input == 1) {
            System.out.println("Jan");
        } else if (input == 2) {
            System.out.println("feb");
        } else if (input == 3) {
            System.out.println("MAr");
        } else if (input == 4) {
            System.out.println("APr");
        } else if (input == 5) {
            System.out.println("MAy");
        } else if (input == 6) {
            System.out.println("JUN");
        } else if (input == 7) {
            System.out.println("Junl");
        } else if (input == 8) {
            System.out.println("Aug");
        } else if (input == 9) {
            System.out.println("SEP");
        } else if (input == 10) {
            System.out.println("OCT");
        } else if (input == 11) {
            System.out.println("NOV");
        } else if (input == 12) {
            System.out.println("DEC");
        } else {
            System.out.println("invalid");
        }
    }

    public void switchclass(int num) {

        switch (num) {
            case 1: {
                System.out.println("jan");
            }
            case 2: {
                System.out.println("jan");
                break;
            }
            case 3: {
                System.out.println("feb");
                break;
            }
            case 4: {
                System.out.println("apr");
                break;
            }
            case 5: {
                System.out.println("may");
                break;
            }
            case 6: {
                System.out.println("jun");
                break;
            }
            case 7: {
                System.out.println("jUL");
                break;
            }
            case 8: {
                System.out.println("AUG");
                break;
            }
            case 9: {
                System.out.println("SEP");
                break;
            }
            case 10: {
                System.out.println("OCT");
                break;
            }
            case 11: {
                System.out.println("NOV");
                break;
            }
            case 12: {
                System.out.println("DEC");
                break;
            }
            default: {
                System.out.println("invalid");
            }
        }

    }
}
