package com.codecool.battleship.GUI;

import static com.codecool.battleship.utils.Constants.*;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GUI extends JFrame {
    private JLayeredPane layeredPane;

    public GUI() {

        layeredPane = initLayeredPane();

        ImageIcon icon = new ImageIcon(ICONS_DIRECTORY + "gameIcon.png");
//        ImageIcon icon2 = new ImageIcon(ICONS_DIRECTORY + "menuBackGround.png");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setSize(GUI_WIDTH, GUI_HEIGHT);
//        this.setResizable(false);
        this.setTitle(GAME_TITLE);
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(0, 130, 130));


        this.add(layeredPane, BorderLayout.CENTER);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private JLayeredPane initLayeredPane() {


        Menu menuPanel = new Menu();
//        GamePanel gamePanel = new GamePanel();
//        HighScorePanel highScorePanel = new HighScorePanel();

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setLayout(new BorderLayout());
        layeredPane.setPreferredSize(this.getSize());
//        layeredPane.setBounds(0, 0, GUI_WIDTH, GUI_HEIGHT);
        layeredPane.add(menuPanel, BorderLayout.CENTER);
        layeredPane.setLayer(menuPanel, JLayeredPane.DRAG_LAYER);
        Border border = BorderFactory.createLineBorder(Color.red, 3);
        layeredPane.setBorder(border);

//        layeredPane.add(gamePanel, Integer.valueOf(1));
//        layeredPane.add(highScorePanel, Integer.valueOf(0));;
//        layeredPane.setVisible(true);
        return layeredPane;
    }

    @Override
    public JLayeredPane getLayeredPane() {
        return layeredPane;
    }

}
