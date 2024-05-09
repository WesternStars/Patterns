package criational.objectPool;

import criational.objectPool.pool.ObjectPool;
import criational.objectPool.poolable.Bitmap;

import java.awt.*;

public class ObjectPoolStarter {

    private static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<>(() -> new Bitmap("Logo.bmp"), 5);

    public static void main(String[] args) {
        System.out.println("Pool size(start): " + bitmapPool.size());
        Bitmap b1= bitmapPool.get();
        b1.setLocation(new Point(10, 10));
        Bitmap b2 = bitmapPool.get();
        b2.setLocation(new Point(-20, 30));
        System.out.println("Pool size: " + bitmapPool.size());

        b1.draw();
        b2.draw();

        bitmapPool.release(b1);
        bitmapPool.release(b2);
        System.out.println("Pool size(release): " + bitmapPool.size());
    }
}
