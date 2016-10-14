package Model;

/**
 * Created by Артем on 14.10.2016.
 */
public class Field {
    public enum Type{X,O, NOT_SET}

    Type[][] cells;

    public Field() {
        cells = new Type[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cells[i][j] = Type.NOT_SET;
            }
        }
    }

    public void show() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (cells[i][j]) {
                    case X:
                        System.out.print("X");
                        break;
                    case O:
                        System.out.print("O");
                        break;
                    case NOT_SET:
                        System.out.println(".");
                        break;
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void doShoot(Point point, Type type) {
        //TODO проверка что нельзя выстрелить два раза в одну точку
        cells[point.getX()][point.getY()] = type;
    }

    public boolean isChekWinner(Type type) {
        boolean isWin= false;

        if (cells[0][0] == type && cells[1][1] == type && cells[2][2] == type) {
            isWin = true;
        }



        return isWin;
    }
}
