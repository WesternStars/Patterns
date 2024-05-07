package criational.prototype;

import criational.prototype.unit.General;
import criational.prototype.unit.Point3D;
import criational.prototype.unit.SwordsMan;

public class UnitPrototypeStarter {

    public static void main(String[] args) throws CloneNotSupportedException {
        SwordsMan s1 = new SwordsMan();
        s1.move(new Point3D(-10, 0, 0), 20);
        s1.attack();

        System.out.println(s1);
        SwordsMan s2 = (SwordsMan) s1.clone();
        System.out.println("Cloned swordsman: " + s2);

        General g1 = new General();
        g1.boostMoral();
        System.out.println(g1);
        try {
            g1.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println(ex);
        }
    }
}
