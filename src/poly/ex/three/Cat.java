package poly.ex.three;

public class Cat extends AbAnimal {

    @Override
    public void sound() {
        System.out.println("야옹야옹");
    }

    @Override
    public void move() {
        System.out.println("고양이 움직임");
    }
}
