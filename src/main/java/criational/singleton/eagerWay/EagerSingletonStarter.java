package criational.singleton.eagerWay;

public class EagerSingletonStarter {

    public static void main(String[] args) throws ClassNotFoundException, InterruptedException {
        EagerSingleton.start();
        System.out.println("Done");
        EagerSingleton s1 = EagerSingleton.getInstance();
        EagerSingleton s2 = EagerSingleton.getInstance();
        System.out.println(s1 == s2);
    }
}
