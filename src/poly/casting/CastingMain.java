package poly.casting;

import poly.basic.Child;
import poly.basic.Parents;

public class CastingMain {

    public static void main(String[] args) {

        Parents poly = new Child();
//        poly.childMethod();

        Child child = (Child) poly;
        child.childMethod();

    }
}
