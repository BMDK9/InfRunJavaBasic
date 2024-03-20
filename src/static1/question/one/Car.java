package static1.question.one;

public class Car {

    String name;
    static int totalCars;

    public Car(String name) {
        this.name = name;
        System.out.println("차량 구입, 이름 : " + name);
        totalCars++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수 : " + totalCars);
    }
}
