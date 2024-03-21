package poly.question.one;

public class AnimalSoundMain {

    public static void main(String[] args) {
//        Dog dog = new Dog();
//        Cat cat = new Cat();
        Pig pig = new Pig(); // 오버라이딩 안함
//        AbAnimal animal = new AbAnimal(); // 생성되면 안되느 것
        Animal[] animalArr = {new Dog(), new Cat(), new Cow(), pig}; // 컨트롤 + 알트 + N

        System.out.println("울음소리 테스트 시작");
        for (Animal a : animalArr) {
            soundAnimal(a);
        }
        System.out.println("울음소리 테스트 종료");
    }

    private static void soundAnimal(Animal animal) {
        animal.sound();
    }
}