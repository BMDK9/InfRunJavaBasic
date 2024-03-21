package poly.overriding;


public class OverridingMain {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("child = " + child.value);
        child.method();

        Parents parents = new Parents();
        System.out.println("Parents -> Parents");
        System.out.println("parents = " + parents.value);
        parents.method();

        Parents poly = new Child();
        System.out.println("Parents -> Child");
        System.out.println("poly = " + poly.value);
        poly.method();
    }
}
