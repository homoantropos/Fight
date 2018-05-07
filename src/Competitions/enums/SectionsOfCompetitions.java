package Competitions.enums;

public enum SectionsOfCompetitions {
    FORMAL_TECHNICAL_COMPOSITIONS ("ФТК"),
    SUBMISSION_FIGHT ("СФ"),
    LIMITED_FIGHT ("ЛФ"),
    REAL_FIGHT ("РФ"),
    MMA ("ММА");

    private String nameOfSectionOfComp;

    public String getNameOfSectionOfComp() {
        return nameOfSectionOfComp;
    }

    public void setNameOfSectionOfComp(String nameOfSectionOfComp) {
        this.nameOfSectionOfComp = nameOfSectionOfComp;
    }

    SectionsOfCompetitions(String nameOfSectionOfComp) {

        this.nameOfSectionOfComp = nameOfSectionOfComp;
    }
}
