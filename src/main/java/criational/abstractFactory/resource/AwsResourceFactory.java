package criational.abstractFactory.resource;

import criational.abstractFactory.unit.Ec2Instance;
import criational.abstractFactory.unit.Instance;
import criational.abstractFactory.unit.S3Storage;
import criational.abstractFactory.unit.Storage;

public class AwsResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int inMib) {
        return new S3Storage(inMib);
    }
}
