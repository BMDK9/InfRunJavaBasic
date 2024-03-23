package poly.car0;

public class Model3 implements Car {

    private final String name = "Model3";

    protected Model3() {}

    @Override
    public String name() {
        return this.name;
    }

    public void startEngine() {
        System.out.println("Model3.startEngine");
    }

    public void offEngine() {
        System.out.println("Model3.offEngine");
    }

    public void pressAccelerator() {
        System.out.println("Model3.pressAccelerator");
    }
}
