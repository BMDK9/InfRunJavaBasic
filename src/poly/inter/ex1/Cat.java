package poly.inter.ex1;

public class Cat implements InterAnimal {


    @Override
    public void sound() {
        System.out.println("야옹야옹");
    }

    @Override
    public void move() {
        System.out.println("고양이 움직임");
    }
}
