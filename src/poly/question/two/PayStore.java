package poly.question.two;

public abstract class PayStore {

    private static final Pay[] pays = {new KakaoPay(), new NaverPay()};

    public static Pay findPay(String option) {

        for (Pay p : pays) {
            if (p.name().equals(option)) {
                return p;
            }
        }
        return new DefaultPay();
    }
}
