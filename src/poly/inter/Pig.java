package poly.inter;


public class Pig implements InterAnimal {

    @Override
    public void sound() {
        System.out.println("꿀꿀");
    }

    @Override
    public void move() {
        System.out.println("돼지 움직임");
    }

    public void pigMethod() {
        System.out.println("돼지 전용");
    }
}
