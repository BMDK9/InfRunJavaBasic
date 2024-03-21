package poly.inter;

public interface InterAnimal { // 순수 추상 클래스 편의 버전, 인터페이스
    // 인터페이스의 모든 메서드는 public & abstract, 그리고 public & abstract 를 생략 가능
    // 다중 구현(상속) 가능
    int LIFE = 1;
    // 인터페이스의 변수는 상수(public static final)다.
    void sound();

    void move();
}
