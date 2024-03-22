package poly.abstract_interface;

import java.sql.SQLOutput;

public class Dog extends AbstractAnimal{

    @Override
    public void sound() {
        System.out.println("강아지는 멍멍");
    }
}
