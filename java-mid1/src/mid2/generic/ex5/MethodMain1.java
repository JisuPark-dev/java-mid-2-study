package mid2.generic.ex5;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(1);
        Integer i1 = GenericMethod.<Integer>genericMethod(2);
        Integer i2 = GenericMethod.<Integer>numberMethod(3);
        Double v = GenericMethod.<Double>numberMethod(3.0);
    }
}
