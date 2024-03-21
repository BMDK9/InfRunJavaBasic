package poly.question.three;

public class AnimalSoundMain {

    public static void main(String[] args) {

        AbAnimal[] abAnimalArr = {new Dog(), new Cat(), new Cow(), new Pig()};

        System.out.println("추상 울음소리 테스트 시작");
        for (AbAnimal a : abAnimalArr) {
            soundAnimal(a);
            a.move(); // 오버라이딩 메서드가 우선권 가짐
        }
        System.out.println("추상 울음소리 테스트 종료");
    }

    private static void soundAnimal(AbAnimal abAnimal) {
        abAnimal.sound();
    }
}