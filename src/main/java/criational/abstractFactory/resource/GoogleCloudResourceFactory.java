package criational.abstractFactory.resource;

import criational.abstractFactory.unit.GoogleCloudeStorage;
import criational.abstractFactory.unit.GoogleComputeEngineInstance;
import criational.abstractFactory.unit.Instance;
import criational.abstractFactory.unit.Storage;

public class GoogleCloudResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int inMib) {
        return new GoogleCloudeStorage(inMib);
    }
}
