package poly.ex.two;

public abstract class AbAnimal { // abstract(추상) 클래스, 추상 메서드가 하나라도 있으면 클래스는 추상으로
// 추상 메서드는 인스턴스화 불가
    public abstract void sound(); // 추상 메서드, 상속 시 자식이 무조건 오버라이딩 해야함

    public void move() { // 추상 메서드가 아니면 오버라이딩 안해도 됨.
        System.out.println("동물 움직임");
    }
}
