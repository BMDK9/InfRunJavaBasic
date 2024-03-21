package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        Parents parents = new Parents();
        parents.parentsMethod();

        Child child = new Child();
        child.parentsMethod();
        child.childMethod();

        Parents poly = new Child();
        poly.parentsMethod();
//        poly.childMethod();
    }
}
