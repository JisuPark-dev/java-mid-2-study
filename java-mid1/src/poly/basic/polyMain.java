package poly.basic;

public class polyMain {
    public static void main(String[] args) {
        // 부모 -> 부모
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 -> 자식
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // 부모 -> 자식
        Parent poly = new Child();
        poly.parentMethod();

        // 자식 -> 부모
//        Child child2 = new Parent();
    }
}
