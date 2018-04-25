package Competitions;

import java.time.LocalDate;

class Partisipator extends Person {

    private Integer age;
    private LocalDate dOB;
    private String club;
    private String coach;
    private String kindOfProgram;
    private Integer place;
    String rang;
    private Integer yearOfBirth;
    private Integer monthOfBirth;
    private Integer dayOfBirth;

    Partisipator(String name, Boolean sex, String town, LocalDate dOB, Integer age, String club, String coach, String rang, String kindOfProgram) {
        super(name, sex, town);
        this.age = age;
        this.dOB = dOB;
        this.club = club;
        this.coach = coach;
        this.rang = rang;
        this.kindOfProgram = kindOfProgram;
    }

    LocalDate getdOB() {return dOB;}

    void setDoB (LocalDate dOB) {
        this.dOB = dOB;
    }

    Integer getAge() {return age;}

    void setAge (Integer age) {
        this.age = age;
    }

    String getClub() {return club;}

    void setClub(String club) {
        this.club = club;
    }

    String getCoach() {return coach;}

    void setCoach(String coach) {
        this.coach = coach;
    }

    String getRang () {return rang;}

    void setRang (String rang){
        this.rang = rang;
    }

    String getKindOfProgram() {return kindOfProgram;}

    void setKindOfProgram(String kindOfProgram) {
        this.kindOfProgram = kindOfProgram;
    }

    Integer getPlace() {return place;}

    void setPlace(Integer place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return getName() + " " + getTown() + " " + getdOB().toString() + " " + getAge() + " " + club + " " + coach + " " + rang + " " + kindOfProgram;
    }
}