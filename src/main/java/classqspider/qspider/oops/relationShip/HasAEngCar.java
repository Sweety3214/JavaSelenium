package classqspider.qspider.oops.relationShip;

public class HasAEngCar {
    private String modelName;
    private HasAEngine hasAEngine = new HasAEngine(12200);    //calling engine class and make it private

    HasAEngCar(String modelName) {    // constructor
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public HasAEngine getHasAEngine() {
        return hasAEngine;
    }

}
