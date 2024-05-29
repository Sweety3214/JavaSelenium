package classqspider.qspider.oops.upcasting.ex2up;

public class Child extends Parent {
    private int childAge;

    public int getChildAge() {
        return childAge;
    }

    public void setChildAge(int childAge) {
        this.childAge = childAge;
    }

    public Child(String parentName, int childAge) {
        super(parentName);
        this.childAge = childAge;
    }

    public Child(int childAge) {
        this.childAge = childAge;
    }

    public Child(){

    }
}
