package access.a;

public class AccessData {

    public int publicInt;
    int defaultInt;
    private int privateInt;

    public void publicMethod() {
        System.out.println("public Method : " + publicInt);
    }

    void defaultMethod() {
        System.out.println("default Method : " + defaultInt);
    }

    private void privateMethod() {
        System.out.println("private Method : " + privateInt);
    }

    public void innerAccess() {
        System.out.println("내부 호출");
        privateInt = 100;
        defaultInt = 200;
        privateInt = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
