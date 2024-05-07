package criational.prototype.unit;

public class SwordsMan extends GameUnit {

    private String state = "idle";

    public void attack() {
        state = "attacking";
    }

    @Override
    protected void reset() {
        state = "idle";
    }

    @Override
    public String toString() {
        return "SwordsMan " + state + " @ " + getPosition();
    }
}
