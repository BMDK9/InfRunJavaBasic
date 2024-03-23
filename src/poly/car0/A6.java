package poly.car0;

public class A6 implements Car {

    private final String name = "A6";

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public void startEngine() {
        System.out.println("A6.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("A6.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("A6.pressAccelerator");
    }
}
