package poly.question.two;

public class KakaoPay implements Pay {

    private final String name = "kakao";

    public boolean pay(int amount) {
        System.out.println("카카오 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }

    @Override
    public String name() {
        return this.name;
    }
}