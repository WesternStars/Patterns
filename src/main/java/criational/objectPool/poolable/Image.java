package criational.objectPool.poolable;

import criational.objectPool.pool.Poolable;

import java.awt.*;

public interface Image extends Poolable {

    void draw();

    Point getLocation();

    void setLocation(Point location);
}
