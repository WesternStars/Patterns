package criational.singleton.eagerWay;

public class EagerSingleton {

    public static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("Eager loading");
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

    public static void start() {
        System.out.println("Singleton start");
    }
}
