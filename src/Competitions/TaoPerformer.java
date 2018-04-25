package Competitions;

import java.time.LocalDate;

class TaoPerformer extends Partisipator {

    private String kindOfTao;
    private Float result;

    TaoPerformer (String name, Boolean sex, String town, LocalDate dOB, Integer age, String club, String coach, String rang, String kindOfProgram, String kindOfTao) {
        super(name, sex, town, dOB, age, club, coach, rang, kindOfProgram);
        this.kindOfTao = kindOfTao;
    }

    String getKindOfTao() {
        return kindOfTao;
    }

    void setKindOfTao(String kindOfTao) {
        this.kindOfTao = kindOfTao;
    }

    Float getResult () {
        return result;
    }

    void setResult (Float result) {
        this.result = result;
    }

    Float setResult2 (Float dec1) {
        result = dec1/4;
        return result;
    }

    static void printTitle() {
        System.out.println(String.format("%-35s %-18s %-13s %-3s %-18s %-20s %-10s %-22s %-20s %-9s", "             П.І. по Б.", "       МІСТО", " ДАТА НАРОДЖ.", "ВІК", "       КЛУБ", "       ТРЕНЕР", "  РОЗРЯД", "     ЕТАП ЗМАГАНЬ", "      НАЗВА ТАО", "РЕЗУЛЬТАТ"));
        System.out.println(String.format("%-35s %-18s %-13s %-3s %-18s %-20s %-10s %-22s %-20s %-9s", "___________________________________", "__________________", "____________", "___", "__________________", "____________________", "__________", "______________________", "____________________", "__________"));

    }

    static void printLines() {
        System.out.println(String.format("%-35s %-18s %-13s %-3s %-18s %-20s %-10s %-22s %-20s %-9s", "___________________________________", "__________________", "____________", "___", "__________________", "____________________", "__________", "______________________", "____________________", "__________"));
    }

    @Override
    public String toString() {
        return String.format("%-35s %18s %13s %3d %18s %20s %10s %22s %20s %9.3f", getName(), getTown(), getdOB().toString(), getAge(), getClub(), getCoach(), getRang(), getKindOfProgram(), kindOfTao, result);
    }
}