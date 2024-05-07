package criational.prototype.unit;

public abstract class GameUnit implements Cloneable {

    private Point3D position;

    public GameUnit() {
        position = Point3D.ZERO;
    }

    public GameUnit(int x, int y, int z) {
        position = new Point3D(x, y, z);
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        GameUnit unit = (GameUnit) super.clone();

        unit.initialyze();
        return unit;
    }

    protected void initialyze() {
        position = Point3D.ZERO;
        this.reset();
    }

    protected abstract void reset();

    public void move(Point3D direction, float distance) {
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        position = position.add(finalMove);
    }

    public Point3D getPosition() {
        return position;
    }
}
