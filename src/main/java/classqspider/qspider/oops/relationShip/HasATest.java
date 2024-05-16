package classqspider.qspider.oops.relationShip;

public class HasATest {
    public static void main(String[] args) {

        HasAEngCar hasAEngCar = new HasAEngCar("Tesla");
        System.out.println(hasAEngCar.getModelName());
        System.out.println("hp: " + hasAEngCar.getHasAEngine().gethP());          //HasAEngine getHasAEngine()
    }
}
