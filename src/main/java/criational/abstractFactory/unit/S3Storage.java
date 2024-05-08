package criational.abstractFactory.unit;

public class S3Storage implements Storage {

    public S3Storage(int volume) {
        System.out.println("Allocated " + volume + " on AWS");
    }

    @Override
    public String getId() {
        return "S31";
    }
}
