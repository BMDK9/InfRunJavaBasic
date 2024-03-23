package poly.question.two;

import java.io.BufferedReader;
import java.io.IOException;

public abstract class StartPay {

    public static void startPay(BufferedReader br, PayService payService) throws IOException {
        while (true) {
            System.out.println("결제를 종료하시려면 0번을 눌러주세요.");
            System.out.print("결제를 진행하시려면 결제하실 페이를 입력해주세요. : ");
            String option = br.readLine();

            if (option.equals("0")) {
                break;
            }

            System.out.print("결제 금액을 입력해주세요. : ");
            int amount = Integer.parseInt(br.readLine());

            payService.processPay(option, amount);
            System.out.println();
        }
    }
}
