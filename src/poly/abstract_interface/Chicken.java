package poly.abstract_interface;

public class Chicken extends AbstractAnimal implements Fly{

    @Override
    public void sound() {
        System.out.println("닭은 꼬끼오");
    }

    @Override
    public void fly() {
        System.out.println("닭이 난다~");
    }
}
