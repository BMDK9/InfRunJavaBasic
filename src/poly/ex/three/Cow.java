package poly.ex.three;

public class Cow extends AbAnimal {

    @Override
    public void sound(){
        System.out.println("음메~");
    }

    @Override
    public void move() {
        System.out.println("소 움직임");
    }
}
