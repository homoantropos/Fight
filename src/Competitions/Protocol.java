package Competitions;

import Competitions.enums.SectionsOfCompetitions;
import Competitions.enums.StagesOfCompetitions;

import java.util.ArrayList;

public class Protocol {
    String nameOfCompetitions;
    String placeOfCompetitionsHolding;
    String dateOfCompetitionsHolding;
    StagesOfCompetitions stage;
    SectionsOfCompetitions section;
    ArrayList<Person> participators = new ArrayList<>();

    public Protocol(String nameOfCompetitions, String placeOfCompetitionsHolding, String dateOfCompetitionsHolding, StagesOfCompetitions stage, SectionsOfCompetitions section) {
        this.nameOfCompetitions = nameOfCompetitions;
        this.placeOfCompetitionsHolding = placeOfCompetitionsHolding;
        this.dateOfCompetitionsHolding = dateOfCompetitionsHolding;
        this.stage = stage;
        this.section = section;
    }

    public ArrayList<Person> setPartisipators (Person p) {
        participators.add(p);
        return participators;
    }

    public ArrayList<Person> getParticipators () {
        return participators;
    }

    public void print () {
        System.out.println(String.format("%45s", "ПРОТОКОЛ ПРОВЕДЕННЯ ЗМАГАНЬ"));
        System.out.println(String.format("%45s", nameOfCompetitions));
        System.out.println(String.format("%25s %25s", placeOfCompetitionsHolding, dateOfCompetitionsHolding));
        System.out.println("Етап змагань: " + section.getNameOfSectionOfComp());
        for (Person p : participators)
            System.out.println(p.toString());
    }
}
