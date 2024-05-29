package classqspider.task;

public class TaskCondition2 {
    public static void main(String[] args) {
        // check whether the person is eligible for ARMY 1.height= or above5.6f   2.weight = 60 to 70
        float ht = 5.6f;
        int wt = 66;
        System.out.println(((ht >= 5.6f) && ((wt >= 60) && (wt <= 70))) ? "Eligible" : "not Eligible");

    }
}
