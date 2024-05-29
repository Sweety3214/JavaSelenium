package classqspider.qspider.oops.inheritance.singleInheritance.tk1;

public class BasketBallC extends BallP {
    private int noOfPlayers;

    public static void main(String[] args) {
        BallP ballP=new BallP();
        ballP.display();
        System.out.println(ballP.ballRadius);
    }
}
