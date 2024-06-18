package generic.ex3;

public class Main1 {
    public static void main(String[] args) {
        GenericBox<String> genericBox = new GenericBox<>();

        genericBox.set("hi");
        System.out.println(genericBox.get());
    }
}
