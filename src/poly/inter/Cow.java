package poly.inter;

public class Cow implements InterAnimal {

    @Override
    public void sound(){
        System.out.println("음메~");
    }

    @Override
    public void move() {
        System.out.println("소 움직임");
    }
}
