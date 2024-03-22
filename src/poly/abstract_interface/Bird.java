package poly.abstract_interface;

public class Bird extends AbstractAnimal implements Fly{

    @Override
    public void sound() {
        System.out.println("새는 삐용삐용");
    }

    @Override
    public void fly() {
        System.out.println("새가 난다~");
    }
}
