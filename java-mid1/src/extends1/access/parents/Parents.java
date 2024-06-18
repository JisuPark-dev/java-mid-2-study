package extends1.access.parents;

public class Parents {

    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod() {
        System.out.println("Parents.publicMethod");
    }

    protected void protectedMethod() {
        System.out.println("Parents.protectedMethod");
    }

    void defaultMethod() {
        System.out.println("Parents.defaultMethod");
    }

    private void privateMethod() {
        System.out.println("Parents.privateMethod");
    }

    public void printParent() {
        System.out.println(" == Parent 메서드 안 ==");
        System.out.println("publicValue = " + publicValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("defaultValue = " + defaultValue);
        System.out.println("privateValue = " + privateValue);

        //부모 메서드 안에서 모두 접근 가능
        defaultMethod();
        privateMethod();
    }
}
