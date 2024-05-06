package criational.factoryMethod.message.factoryMethod;

import criational.factoryMethod.message.TextMessage;

public class TextMessageCreator extends MessageCreator {

    @Override
    public TextMessage createMessage() {
        return new TextMessage();
    }
}
