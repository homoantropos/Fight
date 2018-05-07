package Competitions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.TreeSet;

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
    JButton printListOfParticipators;

    String name;
    Boolean sex;
    String town;
    LocalDate dOB;
    Integer year;
    Integer month;
    Integer date;
    Integer age;
    String club;
    String coach;
    String rang;
    String kindOfProgram;
    String kindOfTao;

    TreeSet<Partisipator> participators = new TreeSet<>();


    void go () {

        JPanel panel = new JPanel ();
        JLabel title = new JLabel(" ");
        JLabel title1 = new JLabel(" ");


        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        nameL = new JLabel("П. І. по Б. :");
        nameText = new JTextField(35);
        nameText.addActionListener(new NameListener());

        sexL = new JLabel("Стать:");
        sexCBm = new JRadioButton("Ч", true);
        sexCBm.addActionListener(new SexMListener());
        sexCBf = new JRadioButton("Ж");
        sexCBf.addActionListener(new SexFListener());
        ButtonGroup sexCB = new ButtonGroup();
        sexCB.add(sexCBm);
        sexCB.add(sexCBf);

        townL = new JLabel("Місто:");
        townText = new JTextField(18);
        townText.addActionListener(new TownListener());

        yearL = new JLabel("Рік:");
        yearsText = new JTextField(4);
        yearsText.addActionListener(new YearListener());

        monthL = new JLabel("Місяць:");
        monthText = new JTextField(2);
        monthText.addActionListener(new MonthListener());

        dateL = new JLabel("День:");
        dateText = new JTextField(3);
        dateText.addActionListener(new DateListener());

        clubL = new JLabel("Клуб:");
        clubText = new JTextField(20);
        clubText.addActionListener(new ClubListener());

        coachL = new JLabel("Тренер:");
        coachText = new JTextField(20);
        coachText.addActionListener(new CoachListener());

        rangL = new JLabel("Звання/розряд:");
        rangText = new JTextField(10);
        rangText.addActionListener(new RangListener());

        kindOfProgramL = new JLabel("Вид програми:");
        kindOfProgramText = new JTextField(22);
        kindOfProgramText.addActionListener(new KOPListener());

        kindOfTaoL = new JLabel("Назва тао:");
        kindOfTaoText = new JTextField(20);
        kindOfTaoText.addActionListener(new KOTListener());

        ctreateParticipant = new JButton("Додати учасника");
        printListOfParticipators = new JButton("Друкувати");
        printListOfParticipators.addActionListener(new PrintListener());
        JPanel panbutton = new JPanel();
        panbutton.add(ctreateParticipant);
        panbutton.add(printListOfParticipators);
        ctreateParticipant.addActionListener(new CreateNewPListener());

        JPanel panelname = new JPanel();
        panelname.add(nameL);
        panelname.add(nameText);
        panel.add(panelname);

        JPanel panelsex = new JPanel();
        panelsex.add(sexL);
        panelsex.add(sexCBm, BorderLayout.WEST);
        panelsex.add(sexCBf, BorderLayout.EAST);

        JPanel panelTown = new JPanel();
        panelTown.add(townL);
        panelTown.add(townText);
        panel.add(panelTown);

        JLabel titleDoB = new JLabel("ДАТА НАРОДЖЕННЯ:");
        JPanel paneldOB = new JPanel();
        panel.add(titleDoB);
        paneldOB.add(yearL);
        paneldOB.add(yearsText);
        paneldOB.add(monthL);
        paneldOB.add(monthText);
        paneldOB.add(dateL);
        paneldOB.add(dateText);
        panel.add(paneldOB);

        JPanel panelClub= new JPanel();
        panelClub.add(clubL);
        panelClub.add(clubText);
        panel.add(panelClub);

        JPanel panelCoach = new JPanel();
        panelCoach.add(coachL);
        panelCoach.add(coachText);
        panel.add(panelCoach);

        JPanel panelRange = new JPanel();
        panelRange.add(rangL);
        panelRange.add(rangText);
        panel.add(panelRange);

        JPanel panelKind = new JPanel();
        panelKind.add(kindOfProgramL);
        panelKind.add(kindOfProgramText);
        panel.add(panelKind);

        JPanel panelkindOfTao = new JPanel();
        panelkindOfTao.add(kindOfTaoL);
        panelkindOfTao.add(kindOfTaoText);
        panel.add(panelkindOfTao);
        panel.add(panelsex);
        panel.add(panbutton);



        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.NORTH, title1);
        frame.getContentPane().add(BorderLayout.SOUTH, title);

        frame.setSize(550, 420);
        frame.setVisible(true);
    }

    class NameListener implements ActionListener {
        public void actionPerformed (ActionEvent nam){
            name = nameText.getText();
            townText.requestFocus();
        }
    }
    class SexMListener implements ActionListener {
        public void actionPerformed (ActionEvent sexM) {
            sex = false;
            ctreateParticipant.requestFocus();
        }
    }
    class SexFListener implements ActionListener {
        public void actionPerformed (ActionEvent sexF) {
            sex = true;
            ctreateParticipant.requestFocus();
        }
    }
    class TownListener implements ActionListener {
        public void actionPerformed (ActionEvent tow) {
            town = townText.getText();
            yearsText.requestFocus();
        }
    }
    class YearListener implements ActionListener {
        public void actionPerformed (ActionEvent yea){
            year = Integer.parseInt(yearsText.getText());
            monthText.requestFocus();
        }
    }
    class MonthListener implements ActionListener {
        public void actionPerformed (ActionEvent mon){
            month = Integer.parseInt(monthText.getText());
            dateText.requestFocus();
        }
    }
    class DateListener implements ActionListener {
        public void actionPerformed (ActionEvent da){
            date = Integer.parseInt(dateText.getText());
            dOB = LocalDate.of(year, month, date);
            age = Secretary.askAge(dOB);
            clubText.requestFocus();
        }
    }
    class ClubListener implements ActionListener {
        public void actionPerformed (ActionEvent clu){
            club = clubText.getText();
            coachText.requestFocus();
        }
    }
    class CoachListener implements ActionListener {
        public void actionPerformed (ActionEvent coac){
            coach = coachText.getText();
            rangText.requestFocus();
        }
    }
    class RangListener implements ActionListener {
        public void actionPerformed (ActionEvent ran){
            rang = rangText.getText();
            kindOfProgramText.requestFocus();
        }
    }
    class KOPListener implements ActionListener {
        public void actionPerformed (ActionEvent kop){
            kindOfProgram = kindOfProgramText.getText();
            kindOfTaoText.requestFocus();
        }
    }
    class KOTListener implements ActionListener {
        public void actionPerformed (ActionEvent kot){
            kindOfTao = kindOfTaoText.getText();
            sexCBm.requestFocus();
        }
    }
    class CreateNewPListener implements ActionListener {
        public void actionPerformed (ActionEvent creP) {
            TaoPerformer taoperformer = new TaoPerformer(name, sex, town, dOB, age, club, coach, rang, kindOfProgram, kindOfTao);
            participators.add(taoperformer);
            nameText.setText("");
            townText.setText("");
            yearsText.setText("");
            monthText.setText("");
            dateText.setText("");
            clubText.setText("");
            coachText.setText("");
            rangText.setText("");
            kindOfProgramText.setText("");
            kindOfTaoText.setText("");
            nameText.requestFocus();
        }
    }
    class PrintListener implements ActionListener {
        public void actionPerformed (ActionEvent printP) {
            for (Partisipator ps : participators)
                System.out.println(ps.toString());
        }
    }
}