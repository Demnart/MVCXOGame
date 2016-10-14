import Model.MainGame;
import View.GameWindow;

/**
 * Created by Артем on 14.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        GameWindow gameWindow = new GameWindow();
        gameWindow.init();

        MainGame.start();
    }
}
