package static1.decodata;

import static static1.decodata.DecoData.*;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. static 호출");
        staticCall();

        System.out.println("2. instance1 호출");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. instance2 호출");
        DecoData data2 = new DecoData();
        data2.instanceCall();
    }
}
