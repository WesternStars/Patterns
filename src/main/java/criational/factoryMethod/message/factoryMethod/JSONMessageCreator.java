package criational.factoryMethod.message.factoryMethod;

import criational.factoryMethod.message.JSONMessage;

public class JSONMessageCreator extends MessageCreator {

    @Override
    public JSONMessage createMessage() {
        return new JSONMessage();
    }
}
