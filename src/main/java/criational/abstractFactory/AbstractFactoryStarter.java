package criational.abstractFactory;

import criational.abstractFactory.resource.ResourceFactory;
import criational.abstractFactory.unit.Instance;
import criational.abstractFactory.unit.Instance.Capacity;
import criational.abstractFactory.unit.Storage;

import static criational.abstractFactory.resource.Type.AWS;
import static criational.abstractFactory.resource.Type.GOOGLE;

public class AbstractFactoryStarter {

    public static void main(String[] args) {
        Client gcp = new Client(GOOGLE);
        Instance instance = gcp.createServer(Capacity.medium, 256);
        instance.stop();
        instance.start();

        System.out.println("***********");
        Client aws = new Client(AWS);
        instance = aws.createServer(Capacity.small, 512);
        instance.stop();
        instance.start();
    }

    public static class Client {

        private final ResourceFactory factory;

        public Client(criational.abstractFactory.resource.Type type) {
            factory = type.getFactory();
        }

        public Instance createServer(Capacity capacity, int inMib) {
            Storage storage = factory.createStorage(inMib);
            Instance instance = factory.createInstance(capacity);
            instance.attachStorage(storage);
            return instance;
        }
    }
}
