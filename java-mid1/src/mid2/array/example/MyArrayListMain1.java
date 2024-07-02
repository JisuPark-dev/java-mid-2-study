package mid2.array.example;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListMain1 {
    public static void main(String[] args) {
        MyArrayListV1 list = new MyArrayListV1();
        System.out.println("=== 데이터 추가 ===");
        System.out.println("list = " + list);
        list.add("a");
        System.out.println("list = " + list);
        list.add("b");
        System.out.println("list = " + list);
        list.add("c");
        System.out.println("list = " + list);

        System.out.println("=== 기능 사용 ===");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf(\"b\") = " + list.indexOf("b"));
        System.out.println("list.set(2,\"z\") = " + list.set(2, "z"));
        System.out.println("list = " + list);

        List<Integer> arrayList = new ArrayList<>(3);
        arrayList.add(1);
//        arrayList.add("asdfa"); 타입이 달라서 못 들어간다.
        System.out.println("arrayList = " + arrayList);
    }
}
