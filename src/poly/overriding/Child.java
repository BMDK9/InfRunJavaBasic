package poly.overriding;

public class Child extends Parents {

    public String value = "child";

    @Override
    public void method() {
        System.out.println("Child.method");
    }
}
