package final1.final_init;

public class FinalLocalMain {

    public static void main(String[] args) {

        final int data1;
        data1 = 10;
//        data1 = 20;
        method(10);
    }

    static void method(final int parameter) {
//        parameter = 20;
    }
}
