package Competitions;

import java.time.LocalDate;

class FreeFighter extends Partisipator {

    private Integer weight;
    private String rozdil;

    public FreeFighter(String name, Boolean sex, String town, LocalDate dOB, Integer age, String club, String coach, String rang, String kindOfProgram, Integer weight, String rozdil) {
        super(name, sex, town, dOB, age,  club, coach, rang, kindOfProgram);
        this.weight = weight;
        this.rozdil = rozdil;
    }
}