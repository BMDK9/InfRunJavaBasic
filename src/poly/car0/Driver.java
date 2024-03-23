package poly.car0;

public class Driver {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
        System.out.println(car.name() + "로 자동차를 설정합니다");
    }

    public void drive() {
        System.out.println("운전 시작");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}