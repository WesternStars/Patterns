package criational.abstractFactory.resource;

import criational.abstractFactory.unit.Instance;
import criational.abstractFactory.unit.Storage;

public interface ResourceFactory {

    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int inMib);
}
