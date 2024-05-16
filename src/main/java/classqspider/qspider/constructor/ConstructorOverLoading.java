package classqspider.qspider.constructor;

public class ConstructorOverLoading {
    ConstructorOverLoading() {
        System.out.println("hai");
    }

    ConstructorOverLoading(int i) {

    }

    ConstructorOverLoading(char a) {

    }

    public static void main(String[] args) {
        ConstructorOverLoading constructorOverLoading = new ConstructorOverLoading();
    }
}
