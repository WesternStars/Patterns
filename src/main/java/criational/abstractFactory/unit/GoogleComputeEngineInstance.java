package criational.abstractFactory.unit;

import lombok.ToString;

@ToString
public class GoogleComputeEngineInstance implements Instance {

    public GoogleComputeEngineInstance(Capacity capacity) {
        System.out.println("Running GoogleComputeEngine with capacity " + capacity);
    }

    @Override
    public void start() {
        System.out.println("GoogleComputeEngine is started");
    }

    @Override
    public void stop() {
        System.out.println("GoogleComputeEngine is stopped");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Storage(" + storage.getId() + ") is attached GoogleComputeEngine");
    }
}
