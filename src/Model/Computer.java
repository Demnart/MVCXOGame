package Model;

/**
 * Created by Артем on 14.10.2016.
 */
public class Computer implements IShoot {

    @Override
    public Point getShoot() {
        return Point.getRandomPoint();
    }
}
