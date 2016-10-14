package Model;

/**
 * Created by Артем on 14.10.2016.
 */
public class MainGame {
    public static Field field = new Field();
    public  static  Computer computer = new Computer();
    public static User user = new User();

    public static void start() {
        field.show();
        for (int i = 0; i < 10; i++) {
            field.doShoot(computer.getShoot(), Field.Type.X);
            field.show();
            // chekwin

            field.doShoot(user.getShoot(), Field.Type.O);
            field.show();
            //chekwin
        }
    }
}
