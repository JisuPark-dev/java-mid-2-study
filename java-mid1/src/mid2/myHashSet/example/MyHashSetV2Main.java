package mid2.myHashSet.example;

public class MyHashSetV2Main {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);

        set.add("A");
        set.add("B");
        set.add("AB");
        System.out.println("set = " + set);

        System.out.println("set.contains(\"AB\") = " + set.contains("AB"));

        set.remove("AB");
        System.out.println("set = " + set);
    }
}
