package Competitions.enums;

import Competitions.Competitions;

public enum StagesOfCompetitions {
    OBLIGATORY_PROGRAM ("ОП"),
    COMBAT ("Поєдинок");

    private String nameOfStage;

    StagesOfCompetitions(String nameOfStage) {
        this.nameOfStage = nameOfStage;
    }

    public String getNameOfStage() {
        return nameOfStage;
    }

    public void setNameOfStage(String nameOfStage) {
        this.nameOfStage = nameOfStage;
    }
}
