package classqspider.pratice;


public class IfWeeksTask {
    public static void main(String[] args) {
        IfWeeksTask ifWeeksTask = new IfWeeksTask();
        String d = ifWeeksTask.weeks(10);
        System.out.println(d);

    }

    public String weeks(int days) {
        String output = null;
        if (days == 0) {
            output = "Sunday";
        } else if (days == 1) {
            output = "Monday";
        } else if (days == 2) {
            output = "Tuesday";
        } else if (days == 3) {
            output = "Wednesday";
        } else if (days == 4) {
            output = "Thursday";
        } else if (days == 5) {
            output = "Friday";
        } else if (days == 6) {
            output = "saturday";
        } else {
            output = "invalid";
        }

        return output;

    }
}