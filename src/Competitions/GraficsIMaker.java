package Competitions;

import javax.swing.*;
import java.awt.*;

class GraficsIMaker extends JPanel {

    void go () {
        JFrame frame = new JFrame();
        JButton button = new JButton("РОЗПОЧАТИ ЗМАГАННЯ");
        frame.setContentPane(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    void Drawing (Graphics g) {
        g.fillRect(70, 70, 100, 20);

    }

}