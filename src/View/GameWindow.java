package View;

import Controller.GameController;
import Model.*;
import Model.Point;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Артем on 14.10.2016.
 */
public class GameWindow extends JFrame {
    JPanel jPanel = new JPanel();
    JButton[][] buttons = new JButton[3][3];

    public void init() {
        setSize(400, 400);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("XOGame");

//        setLayout(new BorderLayout());
//        jPanel.setLayout(new FlowLayout());// по умолчанию JPanel!!!Установка в одну строку
        jPanel.setLayout(new GridLayout(3, 3));// табличный вариант установки
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton jButton = new JButton();
                buttons[i][j] = jButton;
                jButton.setText(j % 2 == 0 ? "X" : "O");
                jPanel.add(jButton);
                int finalJ = j;
                int finalI = i;
                jButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String buttontText = e.getActionCommand();
//                        System.out.printf("Button %s , x: %d , y: %d", buttontText , j , i );// частая ошибка
                        System.out.printf("Button %s , x: %d , y: %d\n", buttontText, finalJ, finalI);// частая ошибка
                        GameController.doShoot(new Point(finalI,finalJ),buttontText.equals("X") ? Field.Type.X : Field.Type.O );

                    }
                });
            }
        }

        add(jPanel);
        setVisible(true);
    }
}