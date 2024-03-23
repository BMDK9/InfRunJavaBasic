package poly.car0;

public class K3 implements Car {

    private final String name = "K3";

    @Override
    public String name() {
        return this.name;
    }

    public void startEngine() {
        System.out.println("K3.startEngine");
    }

    public void offEngine() {
        System.out.println("K3.offEngine");
    }

    public void pressAccelerator() {
        System.out.println("K3.pressAccelerator");
    }
}
