package mid2.generic.ex5;

public class GenericMethod {
    public static Object objMethod(Object object) {
        System.out.println("Object pring: " + object);
        return object;
    }

    public static <T> T genericMethod(T t) {
        System.out.println("mid2.generic pring: " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t) {
        System.out.println("number pring: " + t);
        return t;
    }
}
