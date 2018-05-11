package Competitions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartOfWork {
    JFrame frame;
    JButton buttonStart;
    JButton buttonArhiv;
    JPanel panel;

    void star() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();

        buttonStart = new JButton("Нові змагання");
        buttonStart.addActionListener(new StartListener());
        buttonArhiv = new JButton("Архів змагань");

        panel.add(buttonStart);
        panel.add(buttonArhiv);

        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.setSize(550, 420);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    class StartListener implements ActionListener {
        public void actionPerformed (ActionEvent start){
            ParticipantsInputer pint = new ParticipantsInputer();
            pint.go();
        }
    }
}
