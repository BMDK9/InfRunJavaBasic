package access.a;

public class AccessInnerMain {

    public static void main(String[] args) {

        AccessData data = new AccessData();

        // public 호출
        data.publicInt = 1;
        data.publicMethod();

        // default(= 같은 패키지 호출) 호출
        data.defaultInt = 2;
        data.defaultMethod();

        // private 호출
//        data.privateInt = 3;
//        data.privateMethod();

        // innerAccess 내부 호출
        data.innerAccess();
    }
}
