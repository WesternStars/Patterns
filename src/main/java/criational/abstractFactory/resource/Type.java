package criational.abstractFactory.resource;

import lombok.Getter;

@Getter
public enum Type {

    AWS(new AwsResourceFactory()),
    GOOGLE(new GoogleCloudResourceFactory());

    private final ResourceFactory factory;

    Type(ResourceFactory factory) {
        this.factory = factory;
    }

}
