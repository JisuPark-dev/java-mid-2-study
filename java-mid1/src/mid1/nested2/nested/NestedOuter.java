package mid1.nested2.nested;

public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstatnceValue = 2;

    static class Nested{
        private int nestedInstanceValue = 1;

        public void print() {
            System.out.println(nestedInstanceValue);

            System.out.println(outClassValue);
        }
    }
}
