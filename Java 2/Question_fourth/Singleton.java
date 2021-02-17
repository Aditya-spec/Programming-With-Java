package Question_fourth;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("Hello from the private constructor");
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;

    }
}
