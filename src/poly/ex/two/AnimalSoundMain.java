package poly.ex.two;

public class AnimalSoundMain {

    public static void main(String[] args) {
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        new Cow(); // 컨트롤 + 알트 + V
        Pig pig = new Pig();
        AbAnimal[] abAnimalArr = {new Dog(), new Cat(), new Cow(), pig}; // 컨트롤 + 알트 + N

        System.out.println("추상 울음소리 테스트 시작");
        for (AbAnimal a : abAnimalArr) {
            soundAnimal(a);
            a.move();
        }
        System.out.println("추상 울음소리 테스트 종료");
    }

    private static void soundAnimal(AbAnimal abAnimal) {
        abAnimal.sound();
    }
}