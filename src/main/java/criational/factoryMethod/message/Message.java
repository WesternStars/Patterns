package criational.factoryMethod.message;

public abstract class Message {

    public abstract String getContent();

    public void addDefaultHeaders() {
        /*Has some code to add headers*/
    }

    public void encrypt() {
        /*Has some code to encrypt the content*/
    }
}
