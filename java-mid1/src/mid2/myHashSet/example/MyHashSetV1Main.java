package mid2.myHashSet.example;

public class MyHashSetV1Main {
    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1(10);

        //추가
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9);
        System.out.println("set = " + set);

        //검색
        int searchValue = 9;
        System.out.println("set.contains(searchValue) = " + set.contains(searchValue));

        //삭제
        set.remove(searchValue);
        System.out.println("set = " + set);
    }
}
