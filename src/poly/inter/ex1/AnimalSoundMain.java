package poly.inter.ex1;

public class AnimalSoundMain {

    public static void main(String[] args) {
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        new Cow(); // 컨트롤 + 알트 + V
        Pig pig = new Pig();
        InterAnimal[] interAnimalArr = {new Dog(), new Cat(), new Cow(), pig}; // 컨트롤 + 알트 + N

        System.out.println("인터페이스 울음소리 테스트 시작");
        for (InterAnimal a : interAnimalArr) {
            soundAnimal(a);
            a.move();
        }
        System.out.println("인터페이스 울음소리 테스트 종료");
        pig.pigMethod();
    }

    private static void soundAnimal(InterAnimal interAnimal) {
        interAnimal.sound();
    }
}