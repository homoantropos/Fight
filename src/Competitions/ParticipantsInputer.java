package Competitions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;

class ParticipantsInputer extends JPanel {
    JFrame frame;
    JLabel nameL;
    JTextField nameText;
    JLabel sexL;
    JRadioButton sexCBm;
    JRadioButton sexCBf;
    JLabel townL;
    JTextField townText;
    JLabel yearL;
    JTextField yearsText;
    JLabel monthL;
    JTextField monthText;
    JLabel dateL;
    JTextField dateText;
    JLabel clubL;
    JTextField clubText;
    JLabel coachL;
    JTextField coachText;
    JLabel rangL;
    JTextField rangText;
    JLabel kindOfProgramL;
    JTextField kindOfProgramText;
    JLabel kindOfTaoL;
    JTextField kindOfTaoText;
    JButton ctreateParticipant;

    void go () {
        JPanel panel = new JPanel ();

        JPanel panel2 = new JPanel();

        JLabel title = new JLabel("ДОДАТИ УЧАСНИКА", SwingConstants.CENTER);


        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelname = new JPanel();
        nameL = new JLabel("П. І. по Б. :");
        nameText = new JTextField(35);
        panelname.add(nameL);
        panelname.add(nameText);
        panel.add(panelname, BorderLayout.WEST);

        sexL = new JLabel("Стать:");
        sexCBm = new JRadioButton("Ч", true);
        sexCBf = new JRadioButton("Ж");
        ButtonGroup sexCB = new ButtonGroup();
        sexCB.add(sexCBm);
        sexCB.add(sexCBf);
        JPanel panelsex = new JPanel();
        panelsex.add(sexL);
        panelsex.add(sexCBm, BorderLayout.WEST);
        panelsex.add(sexCBf, BorderLayout.EAST);
        panel.add(panelsex, BorderLayout.WEST);

        townL = new JLabel("Місто:");
        townText = new JTextField(18);
        JPanel panelTown = new JPanel();
        panelTown.add(townL);
        panelTown.add(townText);
        panel.add(panelTown, BorderLayout.WEST);

        yearL = new JLabel("Рік:");
        yearsText = new JTextField(4);
        JLabel titleDoB = new JLabel("ДАТА НАРОДЖЕННЯ:");
        JPanel paneldOB = new JPanel();
        panel.add(titleDoB, BorderLayout.WEST);
        paneldOB.add(yearL);
        paneldOB.add(yearsText);

        monthL = new JLabel("Місяць:");
        monthText = new JTextField(2);
        paneldOB.add(monthL);
        paneldOB.add(monthText);

        dateL = new JLabel("День:");
        dateText = new JTextField(3);
        paneldOB.add(dateL);
        paneldOB.add(dateText);
        panel.add(paneldOB, BorderLayout.WEST);

        clubL = new JLabel("Клуб:");
        clubText = new JTextField(20);
        JPanel panelClub= new JPanel();
        panelClub.add(clubL);
        panelClub.add(clubText);
        panel.add(panelClub, BorderLayout.WEST);

        coachL = new JLabel("Тренер:");
        coachText = new JTextField(20);
        JPanel panelCoach = new JPanel();
        panelCoach.add(coachL);
        panelCoach.add(coachText);
        panel.add(panelCoach, BorderLayout.WEST);

        rangL = new JLabel("Звання/розряд:");
        rangText = new JTextField(10);
        JPanel panelRange = new JPanel();
        panelRange.add(rangL);
        panelRange.add(rangText);
        panel.add(panelRange, BorderLayout.WEST);

        kindOfProgramL = new JLabel("Вид програми:");
        kindOfProgramText = new JTextField(22);
        JPanel panelKind = new JPanel();
        panelKind.add(kindOfProgramL);
        panelKind.add(kindOfProgramText);
        panel.add(panelKind, BorderLayout.WEST);

        kindOfTaoL = new JLabel("Назва тао:");
        kindOfTaoText = new JTextField(20);
        JPanel panelkindOfTao = new JPanel();
        panelkindOfTao.add(kindOfTaoL);
        panelkindOfTao.add(kindOfTaoText);
        panel.add(BorderLayout.WEST, panelkindOfTao);

        ctreateParticipant = new JButton("Додати учасника");

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.NORTH, title);
        frame.getContentPane().add(BorderLayout.SOUTH, ctreateParticipant);

        frame.setSize(500, 700);
        frame.setVisible(true);
    }

}