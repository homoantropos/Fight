package Competitions;

import Competitions.enums.CategoriesOfJudges;

public class JudgeOfTao extends Judge implements Decicion {

    private Float decicion;

    public JudgeOfTao(String name, Boolean sex, String town, CategoriesOfJudges category, Float decicion) {
        super(name, sex, town, category);
        this.decicion = decicion;
    }

    public Float getDecicion() {
        return decicion;
    }

    public void setDecicion(Float decicion) {
        this.decicion = decicion;
    }

    public Float setDecicion () {
        System.out.println("оцінка від 1 до 99:");
        int dec = ScanningHelper.inputInt();
        if (dec < 0) {
            setDecicion();
        }
        else if (dec > 99) {
            setDecicion();
        }
        else {
            decicion = dec / 10f;
            return decicion;
        }
        return decicion;
    }
}
