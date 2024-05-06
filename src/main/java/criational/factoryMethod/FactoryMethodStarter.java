package criational.factoryMethod;

import criational.factoryMethod.message.Message;
import criational.factoryMethod.message.factoryMethod.JSONMessageCreator;
import criational.factoryMethod.message.factoryMethod.MessageCreator;
import criational.factoryMethod.message.factoryMethod.TextMessageCreator;

public class FactoryMethodStarter {

    public static void main(String[] args) {
        printMessage(new JSONMessageCreator());

        printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator creator) {
        Message msg = creator.getMessage();
        System.out.println(msg.getContent());
    }
}
