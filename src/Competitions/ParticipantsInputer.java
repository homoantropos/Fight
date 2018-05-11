package Competitions;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.TreeSet;

import static java.util.Calendar.YEAR;

class ParticipantsInputer extends JPanel {
    JFrame frame;
    JLabel nameL;
    JTextField nameText;
    JLabel sexL;
    JRadioButton sexCBm;
    JRadioButton sexCBf;
    JLabel townL;
    JTextField townText;
    JList yearsList;
    JScrollPane yearScroller;
    JMenuBar yearMB;
    JMenu yearM;
    JMenu monthM;
    JList monthList;
    JScrollPane monthsScroller;
    JMenu dateM;
    JList dateList;
    JScrollPane dateScroller;
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


    void go() {

        JPanel panel = new JPanel();
        JLabel title = new JLabel("     ");
        JLabel title1 = new JLabel(" ");
        JLabel title2 = new JLabel("     ");
        JLabel title3 = new JLabel("     ");


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

        yearMB = new JMenuBar();
        yearM = new JMenu("Рік");
        Integer[] years = new Integer[50];
        Calendar today = Calendar.getInstance();
        Integer year = today.get(YEAR) - 6;
        for (int i = 0; i < 50; i++) {
            years[i] = year;
            year = year - 1;
        }
        yearsList = new JList(years);
        yearScroller = new JScrollPane(yearsList);
        yearScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        yearScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        yearScroller.setAutoscrolls(true);
        yearsList.setVisibleRowCount(5);
        yearsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        yearM.add(yearScroller);
        yearMB.add(yearM);
        yearsList.addListSelectionListener(new YearListener());


        monthM = new JMenu("Місяць");
        Integer[] months = new Integer[12];
        for (int j = 0; j < 12; j++) {
            months[j] = j + 1;
        }
        monthList = new JList(months);
        monthsScroller = new JScrollPane(monthList);
        monthsScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        monthsScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        monthList.setVisibleRowCount(5);
        monthList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        monthM.add(monthsScroller);
        yearMB.add(monthM);
        monthList.addListSelectionListener(new MonthListener());

        dateM = new JMenu("День");
        Integer [] dates = new Integer [31];
        for (int d=0; d<31; d++)
            dates[d] = d+1;
        dateList = new JList(dates);
        dateList.setVisibleRowCount(5);
        dateList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        dateScroller = new JScrollPane(dateList);
        dateScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        dateScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dateM.add(dateScroller);
        yearMB.add(dateM);
        dateList.addListSelectionListener (new DateListener());

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

        JLabel titleDoB = new JLabel("народження  ");
        JPanel paneldOB = new JPanel();
        paneldOB.add(yearMB);
        paneldOB.add(titleDoB);
        panel.add(paneldOB);

        JPanel panelClub = new JPanel();
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
        frame.getContentPane().add(BorderLayout.EAST, title2);
        frame.getContentPane().add(BorderLayout.WEST, title3);

        frame.setSize( 550, 420);
        frame.setResizable(false);
        frame.setVisible(true);
    }

        class NameListener implements ActionListener {
            public void actionPerformed(ActionEvent nam) {
                name = nameText.getText();
                townText.requestFocus();
            }
        }

        class SexMListener implements ActionListener {
            public void actionPerformed(ActionEvent sexM) {
                sex = false;
                ctreateParticipant.requestFocus();
            }
        }

        class SexFListener implements ActionListener {
            public void actionPerformed(ActionEvent sexF) {
                sex = true;
                ctreateParticipant.requestFocus();
            }
        }

        class TownListener implements ActionListener {
            public void actionPerformed(ActionEvent tow) {
                town = townText.getText();
                yearM.requestFocus();
            }
        }

        class YearListener implements ListSelectionListener {
            public void valueChanged(ListSelectionEvent yearL) {
                if (!yearL.getValueIsAdjusting()) {
                    year = (Integer) (yearsList.getSelectedValue());
                }
                monthM.requestFocus();
            }
        }

        class MonthListener implements ListSelectionListener {
            public void valueChanged(ListSelectionEvent monL) {
                if (!monthList.getValueIsAdjusting()) {
                    month = (Integer) (monthList.getSelectedValue());
                    dateList.requestFocus();
                }
            }
        }

            class DateListener implements ListSelectionListener {
                public void valueChanged(ListSelectionEvent da) {
                    if (!dateList.getValueIsAdjusting()) {
                        date = (Integer) (dateList.getSelectedValue());
                        dOB = LocalDate.of(year, month, date);
                        age = Secretary.askAge(dOB);
                        clubText.requestFocus();
                    }
                }
            }

            class ClubListener implements ActionListener {
                public void actionPerformed(ActionEvent clu) {
                    club = clubText.getText();
                    coachText.requestFocus();
                }
            }

            class CoachListener implements ActionListener {
                public void actionPerformed(ActionEvent coac) {
                    coach = coachText.getText();
                    rangText.requestFocus();
                }
            }

            class RangListener implements ActionListener {
                public void actionPerformed(ActionEvent ran) {
                    rang = rangText.getText();
                    kindOfProgramText.requestFocus();
                }
            }

            class KOPListener implements ActionListener {
                public void actionPerformed(ActionEvent kop) {
                    kindOfProgram = kindOfProgramText.getText();
                    kindOfTaoText.requestFocus();
                }
            }

            class KOTListener implements ActionListener {
                public void actionPerformed(ActionEvent kot) {
                    kindOfTao = kindOfTaoText.getText();
                    sexCBm.requestFocus();
                }
            }

            class CreateNewPListener implements ActionListener {
                public void actionPerformed(ActionEvent creP) {
                    TaoPerformer taoperformer = new TaoPerformer(name, sex, town, dOB, age, club, coach, rang, kindOfProgram, kindOfTao);
                    participators.add(taoperformer);
                    nameText.setText("");
                    townText.setText("");
                    clubText.setText("");
                    coachText.setText("");
                    rangText.setText("");
                    kindOfProgramText.setText("");
                    kindOfTaoText.setText("");
                    nameText.requestFocus();
                }
            }

            class PrintListener implements ActionListener {
                public void actionPerformed(ActionEvent printP) {
                    TaoPerformer.printTitle();
                    for (Partisipator ps : participators)
                        System.out.println(ps.toString());
                }
            }
}