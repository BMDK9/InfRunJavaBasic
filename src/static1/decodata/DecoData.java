package static1.decodata;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        staticValue++;
        staticMethod();

//        instanceValue++; // 접근 불가
//        instanceMethod(); // 이유는 static은 클래스 영역, 생성되지 않은 instance 영역을 모름
    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod();

        DecoData.staticValue++;
        DecoData.staticMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
