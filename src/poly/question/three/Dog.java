package poly.question.three;

public class Dog extends AbAnimal {

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 움직임");
    }
}