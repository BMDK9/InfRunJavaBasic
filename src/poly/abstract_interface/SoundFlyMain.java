package poly.abstract_interface;

public class SoundFlyMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        animalSound(dog);
        animalSound(bird);
        animalSound(chicken);

        animalFly(bird);
        animalFly(chicken);

        System.out.println();
        System.out.println("이렇게도 된다.");

        dog.move();
        dog.sound();
        bird.move();
        bird.sound();
        bird.fly();
        chicken.move();
        chicken.sound();
        chicken.fly();
    }

    private static void animalSound(AbstractAnimal abstractAnimal) {
        System.out.println("울어!");
        abstractAnimal.sound();
    }

    private static void animalFly(Fly fly) {
        System.out.println("날아올라~");
        fly.fly();
    }
}
