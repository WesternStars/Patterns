package criational.singleton.lazyWay;

public class LazySingletonStarter {

    public static void main(String[] args) {
        LazySingleton.start();
        System.out.println("Done");
        LazySingleton s1 = LazySingleton.getInstance();
        LazySingleton s2 = LazySingleton.getInstance();
        System.out.println(s1 == s2);
    }
}
