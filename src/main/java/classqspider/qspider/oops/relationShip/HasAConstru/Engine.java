package classqspider.qspider.oops.relationShip.HasAConstru;

public class Engine {
  private  double engineSpeed;

   private String engineType;

    public double getEngineSpeed() {
        return engineSpeed;
    }

    public void setEngineSpeed(double engineSpeed) {
        this.engineSpeed = engineSpeed;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public Engine(double engineSpeed, String engineType) {
        this.engineSpeed = engineSpeed;
        this.engineType = engineType;
    }

    public Engine() {
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineSpeed=" + engineSpeed +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
