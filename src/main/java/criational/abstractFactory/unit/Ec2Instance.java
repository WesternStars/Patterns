package criational.abstractFactory.unit;

import lombok.ToString;

@ToString
public class Ec2Instance implements Instance {

    public Ec2Instance(Capacity capacity) {
        System.out.println("Running Ec2 with capacity " + capacity);
    }

    @Override
    public void start() {
        System.out.println("Ec2Instance is started");
    }

    @Override
    public void stop() {
        System.out.println("Ec2Instance is stopped");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Storage(" + storage.getId() + ") is attached Ec2Instance");
    }
}
