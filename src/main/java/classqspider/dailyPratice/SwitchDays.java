package classqspider.dailyPratice;

public class SwitchDays {
    public static void main(String[] args) {
        SwitchDays switchDays = new SwitchDays();
        String result = switchDays.weeks(5);
        System.out.println(result);
    }

    public String weeks(int days) {
        String output;
        switch (days) {
            case 0: {
                output = "sunday";
                break;
            }
            case 1: {
                output = "monday";
                break;
            }
            case 2: {
                output = "Tuesday";
                break;
            }
            case 3: {
                output = " Wednesday";
                break;
            }
            case 4: {
                output = " Thursday";
                break;
            }
            case 5: {
                output = "Friday";
                break;
            }

            case 6: {
                output = "Saturday";
                break;
            }

            default: {
                output = "invalid";
                break;
            }
        }
        return output;
    }
}

