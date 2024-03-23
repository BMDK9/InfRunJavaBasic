package poly.question.two;

public class PayService {

    public void processPay(String option, int amount) {

        System.out.println("결제를 시작합니다. 옵션 : " + option + ", 금액 : " + amount + "원");

        Pay pay = PayStore.findPay(option);
        boolean result = pay.pay(amount);

        if (result) {
            System.out.println("결제가 완료되었습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
