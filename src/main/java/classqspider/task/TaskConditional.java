package classqspider.task;

public class TaskConditional {
    public static void main(String[] args) {
        int p1 = 18, p2 = 16;
        String nat = "Anti Indian";

        System.out.println(((p1 > p2) && (nat == "Indian")) ? "p1eligible" : "p2noteligible");


        int x = 17, y = 28;
        String vote1 = "17 no right to vote";
        String vote2 = "23 rights to vote";
        System.out.println((x > y) ? vote1 : vote2);
    }
}
