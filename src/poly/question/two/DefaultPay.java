package poly.question.two;

public class DefaultPay implements Pay{

    private final String name = "결제 수단 없는 경우";

    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }

    @Override
    public String name() {
        return this.name;
    }
}
