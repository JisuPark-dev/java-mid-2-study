package mid2.myHashSet.example;

public class JavaHashCodeMain {
    public static void main(String[] args) {

        Member member = new Member("sudong");
        Member member2 = new Member("sudong");

        System.out.println(member2.hashCode()== member.hashCode());

        System.out.println("member.hashCode() = " + member.hashCode());
        System.out.println("\"abc\".hashCode() = " + "abc".hashCode());

    }
}
