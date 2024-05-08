package criational.abstractFactory.unit;

public class GoogleCloudeStorage implements Storage {

    public GoogleCloudeStorage(int volume) {
        System.out.println("Allocated " + volume + " on GCP");
    }

    @Override
    public String getId() {
        return "GCPCS2";
    }
}
