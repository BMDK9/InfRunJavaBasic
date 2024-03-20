package static1.deco;

import static1.deco2.DecoUtil2;

public class DecoMain1 {

    public static void main(String[] args) {
        String s = "hello static";
        DecoUtil1 decoUtil1 = new DecoUtil1();
        String deco = decoUtil1.deco(s);

        System.out.println("before : " + s);
        System.out.println("after : " + deco);
    }
}
