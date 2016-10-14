package Model;

/**
 * Created by Артем on 14.10.2016.
 */
public class User implements IShoot {
    public static Point point;
    public volatile static boolean isShoot;

    @Override
    public Point getShoot() {
        isShoot = false;
        while (!isShoot){

        } // не идеальный вариан
        return point;
    }
}
