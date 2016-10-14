package Model;

import java.util.Random;

/**
 * Created by Артем on 14.10.2016.
 */
public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static Point getRandomPoint(){
//        Random random = new Random(); Длинная реализация
//        Point point = new Point(random.nextInt(3), random.nextInt(3));
//        return point;
        return new Point(new Random().nextInt(3), new Random().nextInt(3));
    }
}
