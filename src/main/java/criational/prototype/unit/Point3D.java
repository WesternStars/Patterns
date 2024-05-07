package criational.prototype.unit;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Point3D {

    public static final Point3D ZERO = new Point3D(0, 0, 0);

    private float x, y, z;

    public Point3D normalize() {
        float mag = magnitude();
        return new Point3D(x/mag, y/mag, z/mag);
    }

    private float magnitude() {
        return (float)Math.sqrt(x*x + y*y + z*z);
    }

    public Point3D multiply(float scale) {
        return new Point3D(x*scale, y*scale, z*scale);
    }

    public Point3D add(Point3D vect) {
        return new Point3D(x+vect.x, y+vect.y, z+vect.z);
    }
}
