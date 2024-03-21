package poly.inter;

public class Dog implements InterAnimal {

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 움직임");
    }
}
