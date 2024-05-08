package criational.singleton.lazyWay;

public class LazySingleton {

    private LazySingleton() {
        System.out.println("LazySingleton loading");
    }

    public static LazySingleton getInstance() {
        return Lazy.INSTANCE;
    }

    private static class Lazy {
        public static final LazySingleton INSTANCE = new LazySingleton();
    }

    public static void start() {
        System.out.println("start");
    }
}
